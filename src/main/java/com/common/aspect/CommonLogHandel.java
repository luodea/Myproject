package com.common.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

import com.uitel.LogUtils;

@Component
@Aspect
public class CommonLogHandel {

    /**
     * @Description: ���÷��ʿ�����ͨ����־�����е�
     * @author luodea 
     * @date 2018��4��25��
     */
    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void pointcut() {
	System.out.println("ע�����������Ϊ�е㡣��������������������������������");
    }


    /**
     * 
     * @Description:   ��־��¼�߼�
     * @param joinPoin
     * @return
     * @author luodea 
     * @date 2018��4��27��
     */
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoin) {
	try {
	    //ִ��Ŀ�귽��֮ǰ�߼�
	    StopWatch stopwatch = new StopWatch();
	    stopwatch.start();
	    //ִ��Ŀ�귽��
	    Object result =  joinPoin.proceed();
	    //ִ��Ŀ�귽��֮��
	    stopwatch.stop();
	    new LogUtils().recordeLog(joinPoin, stopwatch); 
	    return result;
	} catch (Throwable e) {
	    e.printStackTrace();
	}

	return null;

    }



}
