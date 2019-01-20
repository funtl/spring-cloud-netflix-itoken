package com.funtl.itoken.common.utils.httpclient.common;

import org.apache.http.client.CookieStore;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.BasicCookieStore;

/**
 * 封装Cookie
 *
 * @author Lusifer
 * @version V1.0.0
 * @date 2017/9/27 21:02
 * @name HttpCookies
 */
public class HttpCookies {

	/**
	 * 使用httpcontext，用于设置和携带Cookie
	 */
	private HttpClientContext context;

	/**
	 * 储存Cookie
	 */
	private CookieStore cookieStore;

	public static HttpCookies custom() {
		return new HttpCookies();
	}

	private HttpCookies() {
		this.context = new HttpClientContext();
		this.cookieStore = new BasicCookieStore();
		this.context.setCookieStore(cookieStore);
	}

	public HttpClientContext getContext() {
		return context;
	}

	public HttpCookies setContext(HttpClientContext context) {
		this.context = context;
		return this;
	}

	public CookieStore getCookieStore() {
		return cookieStore;
	}

	public HttpCookies setCookieStore(CookieStore cookieStore) {
		this.cookieStore = cookieStore;
		return this;
	}


}
