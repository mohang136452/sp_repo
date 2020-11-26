package cn.tedu.web.util;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * 操作cookie相关的api
 *
 */
public class CookieUtil {

    /**
     * @param response
     * @param name
     * @param value
     * @param maxAge
     *   设置cookie
     */
    public static void setCookie(HttpServletResponse response,
                                 String name, String value, String domain, String path, int maxAge) {
        //新建cookie对象
        Cookie cookie = new Cookie(name, value);
        //判断全局cookie是否存在
        if(domain != null) {
            cookie.setDomain(domain);
        }
        //设置cookie相关的信息
        cookie.setPath(path);
        cookie.setMaxAge(maxAge);
        response.addCookie(cookie);
    }
    /**
     * 设置cookie重载方法
     */
    public static void setCookie(HttpServletResponse response, String name, String value, int maxAge) {
        setCookie(response, name, value, null, "/", maxAge);
    }
    /**
     * 设置cookie重载方法
     */
    public static void setCookie(HttpServletResponse response, String name, String value) {
        setCookie(response, name, value, null, "/", 3600);
    }
    /**
     * 设置cookie重载方法
     */
    public static void setCookie(HttpServletResponse response, String name) {
        setCookie(response, name, "", null, "/", 3600);
    }

    /**
     * @param request
     * @param name
     * @return
     * 获取cookie
     */
    public static String getCookie(HttpServletRequest request, String name) {
        //定义value为null
        String value = null;
        //获取cookie数组
        Cookie[] cookies = request.getCookies();
        //循环遍历，查找对应cookie名字对应的cookie
        if (null != cookies) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals(name)) {
                    value = cookie.getValue();
                }
            }
        }
        //返回对应的value
        return value;
    }

    /**
     * @param response
     * @param name
     * @return
     *     移除cookie
     */
    public static void removeCookie(HttpServletResponse response, String name, String domain, String path) {
        setCookie(response, name, "", domain, path, 0);
    }

}