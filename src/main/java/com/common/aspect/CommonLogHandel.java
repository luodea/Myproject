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
     * @Description: 配置访问控制器通用日志管理切点
     * @author luodea 
     * @date 2018年4月25日
     */
    @Pointcut("@annotation(org.springframework.web.bind.annotation.RequestMapping)")
    public void pointcut() {
	System.out.println("注册请求控制器为切点。。。。。。。。。。。。。。。。。");
    }


    /**
     * 
     * @Description:   日志记录逻辑
     * @param joinPoin
     * @return
     * @author luodea 
     * @date 2018年4月27日
     */
    @Around("pointcut()")
    public Object around(ProceedingJoinPoint joinPoin) {
	try {
	    //执行目标方法之前逻辑
	    StopWatch stopwatch = new StopWatch();
	    stopwatch.start();
	    //执行目标方法
	    Object result =  joinPoin.proceed();
	    //执行目标方法之后
	    stopwatch.stop();
	    new LogUtils().recordeLog(joinPoin, stopwatch); 
	    return result;
	} catch (Throwable e) {
	    e.printStackTrace();
	}

	return null;

    }



}
