package com.example.singleton.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.access.AccessDecisionVoter;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

/**
 * SpringSecurity安全配置类
 *  WebSecurityConfigurerAdapter是对WebSecurityConfigurer一个实现
 *  实现了默认的认证和授权, 允许用户自定义一个WebSecurity类，重写其中的三个configure来实现自定义的认证和授权
 */
@Configuration // 由于spring boot的自动装配, 不需要@EnableWebSecurity, @WebSecurityConfig
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    AccessDecisionVoter
}
