package com.example.demo.aspect;

import org.aspectj.lang.annotation.*;

/**
 * 使用Aspect注解，需要先在添加aop依赖
 * spring-boot-starter-aop
 */
@Aspect
public class MyAspect {

    /**
     * 此处需要注意，描述切面的表达式，*和类路径前需要有空格分隔，否则出现
     * Identifier expected 的错误
     */
    @Pointcut("execution(* com.example.demo.dao.impl.UserServiceImpl.printUser(..))")
    public void pointCut(){
        System.out.println("point cut");
    }

    @Before("pointCut()")
    public void before(){
        System.out.println("before...");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("after...");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("afterReturning...");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("afterThrowing");
    }

}
