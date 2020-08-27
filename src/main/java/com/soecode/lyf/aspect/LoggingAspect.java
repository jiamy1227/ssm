package com.soecode.lyf.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author jiamy
 * @Description :
 * @Create on : 2020/8/27 15:11
 **/

@Aspect
@Component
public class LoggingAspect {

    @Before(value="execution(public * com.soecode.lyf.service.BookService.*(..))")
    public void beforeController(){
        System.out.println("beforeService...");
    }

    @Before(value="execution(public * com.soecode.lyf.web.BookController.*(..))")
    public void beforeController2(){
        System.out.println("beforeController...");
    }
}
