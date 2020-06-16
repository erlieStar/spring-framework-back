package com.javashitang.config;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author lilimin
 * @since 2020-06-16
 *
 * 配置有3种实现方式
 * 1. 继承 WebMvcConfigurationSupport 类
 * 2. 继承 WebMvcConfigurerAdapter 类
 * 3. 实现 WebMvcConfigurer
 * 配置的最佳方式是实现WebMvcConfigurer接口，因为java8以后接口有默认实现类，所以2的方式就被废弃了
 */
public class MyWebMvcConfigurer implements WebMvcConfigurer {
}
