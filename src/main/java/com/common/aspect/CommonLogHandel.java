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
     * @Description: ���÷��ʿ�����ͨ����־�����е�
     * @author luodea 
     * @date 2018��4��25��
     */
    @Pointcut("execution(public * *(..))")
    public void controllerAspect() {
	System.out.println("ע�����������Ϊ�е㡣��������������������������������");
    }
    
    
    @After("controllerAspect()")
    public void after(JoinPoint joinPoint) {
	System.out.println("����������е�֮�󡣡�������������������������������");
    }
    
    
    
}
