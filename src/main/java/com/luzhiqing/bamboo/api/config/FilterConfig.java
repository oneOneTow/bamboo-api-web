package com.luzhiqing.bamboo.api.config;

import com.luzhiqing.common.token.TokenAuthFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description:
 * @version:
 * @Author: 陆志庆
 * @CreateDate: 2019/10/29 11:27
 */
@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean registration = new FilterRegistrationBean(tokenAuthFilter());
        registration.addUrlPatterns("/*");
        return registration;
    }

    @Bean
    public TokenAuthFilter tokenAuthFilter(){
        TokenAuthFilter tokenAuthFilter = new TokenAuthFilter();
        tokenAuthFilter.addExclueUrl("/login");
        return tokenAuthFilter;
    }

}
