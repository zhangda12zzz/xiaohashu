package com.quanxiaoha.framework.biz.context.config;

import com.quanxiaoha.framework.biz.context.filter.HeaderUserId2ContextFilter;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @author: 犬小哈
 * @date: 2024/4/15 13:50
 * @version: v1.0.0
 * @description: 自动注册一个自定义 Servlet 过滤器（Filter）到 Spring Boot 应用中，用于从请求头中提取用户 ID 并存入上下文（如 ThreadLocal到这个selevt线程）
 **/
@AutoConfiguration
public class ContextAutoConfiguration {

    @Bean
    public FilterRegistrationBean<HeaderUserId2ContextFilter> filterFilterRegistrationBean() {
        HeaderUserId2ContextFilter filter = new HeaderUserId2ContextFilter();
        FilterRegistrationBean<HeaderUserId2ContextFilter> bean = new FilterRegistrationBean<>(filter);
        return bean;
    }
}
