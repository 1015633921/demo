package com.example.demo.Util;

import com.example.demo.DTO.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @PackageName:com.example.demo.Util
 * @ClassName:PageInterceptor
 * @Description:
 * @Author: DongYu
 * @Date: 2019/7/31 14:41
 **/
public class PageInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        response.setHeader("Access-Control-Allow-Methods", "*");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers",
                "Origin, X-Requested-With, Content-Type, Accept");
        response.setHeader("Access-Control-Allow-Origin","*");
        HttpSession session =request.getSession();
        String userName =(String)session.getAttribute("userName");
        System.out.println(userName);
        StringBuffer url = request.getRequestURL();
        String s = url.toString();

      //  if(!(s.contains("login"))) {
           // String user = (String) session.getAttribute("userName");
           // if (user == null) {
                //response.sendRedirect(request.getContextPath() + "/login");
            //}
       // }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        super.afterCompletion(request, response, handler, ex);
    }
}
