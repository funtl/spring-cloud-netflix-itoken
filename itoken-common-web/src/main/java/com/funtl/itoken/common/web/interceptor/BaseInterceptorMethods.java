package com.funtl.itoken.common.web.interceptor;

import com.funtl.itoken.common.domain.TbSysUser;
import com.funtl.itoken.common.utils.CookieUtils;
import com.funtl.itoken.common.utils.MapperUtils;
import com.funtl.itoken.common.web.constants.WebConstants;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * 拦截器通用函数
 * <p>Title: BaseInterceptorMethods</p>
 * <p>Description: </p>
 *
 * @author Lusifer
 * @version 1.0.0
 * @date 2018/8/16 22:49
 */
@Component
public class BaseInterceptorMethods {

    @Value("${hosts.sso}")
    private static String HOSTS_SSO;

    /**
     * 登录方法拦截
     *
     * @param request
     * @param response
     * @param handler
     * @param url      跳转地址
     * @return
     */
    public static boolean preHandleForLogin(HttpServletRequest request, HttpServletResponse response, Object handler, String url) {
        String token = CookieUtils.getCookieValue(request, WebConstants.SESSION_TOKEN);

        // token 为空表示一定没有登录
        if (StringUtils.isBlank(token)) {
            try {
                response.sendRedirect(String.format("%s/login?url=%s", HOSTS_SSO, url));
            } catch (IOException e) {
                e.printStackTrace();
            }
            return false;
        }

        return true;
    }

    /**
     * 登录方法拦截
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @param tbSysUserJson 登录用户 JSON 对象
     * @param url           跳转地址
     */
    public static void postHandleForLogin(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView, String tbSysUserJson, String url) {
        HttpSession session = request.getSession();
        TbSysUser tbSysUser = (TbSysUser) session.getAttribute(WebConstants.SESSION_USER);

        // 已登录状态
        if (tbSysUser != null) {
            if (modelAndView != null) {
                modelAndView.addObject(WebConstants.SESSION_USER, tbSysUser);
            }
        }

        // 未登录状态
        else {
            if (StringUtils.isNotBlank(tbSysUserJson)) {
                try {
                    // 已登录状态，创建局部会话
                    tbSysUser = MapperUtils.json2pojo(tbSysUserJson, TbSysUser.class);
                    if (modelAndView != null) {
                        modelAndView.addObject(WebConstants.SESSION_USER, tbSysUser);
                    }
                    request.getSession().setAttribute(WebConstants.SESSION_USER, tbSysUser);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }

        // 二次确认是否有用户信息
        if (tbSysUser == null) {
            try {
                response.sendRedirect(String.format("%s/login?url=", HOSTS_SSO, url));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
