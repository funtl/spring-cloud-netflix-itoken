package com.funtl.itoken.web.admin.controller;

import com.funtl.itoken.common.domain.TbSysUser;
import com.funtl.itoken.common.dto.BaseResult;
import com.funtl.itoken.common.utils.MapperUtils;
import com.funtl.itoken.common.web.controller.BaseController;
import com.funtl.itoken.web.admin.service.AdminService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;

@Controller
public class AdminController extends BaseController<TbSysUser, AdminService> {

    @Autowired
    private AdminService adminService;

    @ModelAttribute
    public TbSysUser tbSysUser(String userCode) {
        TbSysUser tbSysUser = null;

        if (StringUtils.isBlank(userCode)) {
            tbSysUser = new TbSysUser();
        } else {
            String json = adminService.get(userCode);
            try {
                tbSysUser = MapperUtils.json2pojo(json, TbSysUser.class);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return tbSysUser;
    }

    /**
     * 跳转首页
     *
     * @return
     */
    @RequestMapping(value = {"", "main"}, method = RequestMethod.GET)
    public String main() {
        return "main";
    }

    /**
     * 跳转首页
     *
     * @return
     */
    @RequestMapping(value = {"index"}, method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    /**
     * 跳转表单页
     *
     * @return
     */
    @RequestMapping(value = "form", method = RequestMethod.GET)
    public String form() {
        return "form";
    }

    /**
     * 保存管理员
     *
     * @param tbSysUser
     * @return
     */
    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(
            TbSysUser tbSysUser,
            HttpServletRequest request,
            RedirectAttributes redirectAttributes) throws Exception {
        // 初始化数据
        tbSysUser.setUserType("1");
        tbSysUser.setMgrType("1");
        tbSysUser.setStatus("0");
        tbSysUser.setCorpCode("0");
        tbSysUser.setCorpName("iToken");

        TbSysUser admin = (TbSysUser) request.getSession().getAttribute("admin");
        String json = adminService.save(MapperUtils.obj2json(tbSysUser), admin.getUserCode());
        try {
            BaseResult baseResult = MapperUtils.json2pojo(json, BaseResult.class);
            redirectAttributes.addFlashAttribute("baseResult", baseResult);

            // 保存成功
            if (baseResult.getSuccess().endsWith("成功")) {
                return "redirect:/index";
            }

            // 保存失败
            else {
                return "redirect:/form";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
