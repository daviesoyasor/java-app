package com.unceentech.bondpay.Middlewares;

import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new RoleChecker());
        registry.addInterceptor(new RoleChecker()).addPathPatterns("/product/new");
    }
}
