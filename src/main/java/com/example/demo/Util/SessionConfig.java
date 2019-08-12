package com.example.demo.Util;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;


/**
 * @PackageName:com.example.demo.Util
 * @ClassName:SessionConfig
 * @Description:
 * @Author: DongYu
 * @Date: 2019/8/1 15:07
 **/
@SpringBootConfiguration
public class SessionConfig extends WebMvcConfigurationSupport {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new PageInterceptor()).addPathPatterns("/**");
    }
    public SessionConfig() {
        super();
    }
}
