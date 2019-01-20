package com.funtl.itoken.common.utils.httpclient.exception;


/**
 * @author arron
 * @version 1.0
 * @date 2015年11月1日 下午2:31:37
 */
public class HttpProcessException extends Exception {

    public HttpProcessException(Exception e) {
        super(e);
    }

    /**
     * @param msg
     */
    public HttpProcessException(String msg) {
        super(msg);
    }

    /**
     * @param message
     * @param e
     */
    public HttpProcessException(String message, Exception e) {
        super(message, e);
    }

}
