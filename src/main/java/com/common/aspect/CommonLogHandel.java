package com.common.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Aspect
@Component
public class CommonLogHandel {

    /**
     * @Description: 配置访问控制器通用日志管理切点
     * @author luodea 
     * @date 2018年4月25日
     */
    @Pointcut("execution(public * *(..))")
    public void controllerAspect() {
	System.out.println("注册请求控制器为切点。。。。。。。。。。。。。。。。。");
    }
    
    
    @After("controllerAspect()")
    public void after(JoinPoint joinPoint) {
	System.out.println("请求控制器切点之后。。。。。。。。。。。。。。。。。");
    }
    
    
    
}
