package com.soecode.lyf.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author jiamy
 * @Description :
 * @Create on : 2020/8/27 14:07
 **/
@PropertySource("classpath:app.properties")
@Component
public class AppConfig {
    @Value("${user.name:aaa}")
    public String name ;

    @Value("${user.age:10}")
    public int age ;
}
