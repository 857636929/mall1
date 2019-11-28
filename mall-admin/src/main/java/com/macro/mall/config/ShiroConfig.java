//package com.macro.mall.config;
//
//import com.fasterxml.jackson.annotation.JsonFilter;
//import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
//import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.logging.Filter;
//
///**
// * Created by xiaobin on 2019/9/25
// */
//@Configuration
//public class ShiroConfig {
//    @Bean
//    public ShiroFilterFactoryBean shirFilter(DefaultWebSecurityManager securityManager) {
//
//        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();
//        shiroFilterFactoryBean.setSecurityManager(securityManager);
//        Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();
//        // 静态资源匿名访问
//        filterChainDefinitionMap.put("/static/**", "anon");
//        // Swagger
//        filterChainDefinitionMap.put("/swagger-ui.html", "anon");
//        filterChainDefinitionMap.put("/webjars/**", "anon");
//        filterChainDefinitionMap.put("/swagger-resources/**", "anon");
//        filterChainDefinitionMap.put("/v2/api-docs", "anon");
//        // 登录匿名访问
//        filterChainDefinitionMap.put("/api/v1/login", "anon");
//        filterChainDefinitionMap.put("/api/v1/logout", "logout");
//        // 其他路径均需要身份认证，一般位于最下面，优先级最低
//        filterChainDefinitionMap.put("/api/v1/**", "authc");
//        shiroFilterFactoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);
//        // 登录的路径
//        //		shiroFilterFactoryBean.setLoginUrl("/login");
//        // 登录成功后跳转的路径
//        //		shiroFilterFactoryBean.setSuccessUrl("/index");
//        // 验证失败后跳转的路径
//        //		shiroFilterFactoryBean.setUnauthorizedUrl("/403");
//        Map<String, Filter> filters = new LinkedHashMap<String, Filter>();
//        JsonFilter jsonFilter = new JsonFilter();
//        filters.put("login", jsonFilter);
//        shiroFilterFactoryBean.setFilters(filters);
//        return shiroFilterFactoryBean;
//    }
//}
