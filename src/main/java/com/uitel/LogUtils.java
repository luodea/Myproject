package com.uitel;



import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.ThreadContext;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;
import org.springframework.util.StopWatch;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

public class LogUtils {

    public void recordeLog(ProceedingJoinPoint joinPoin,StopWatch stopWatch) {

	//获取目标对象
	Signature signature = joinPoin.getSignature();
	//获取目标对象类名
	String className = joinPoin.getTarget().getClass().getName();
	//获取目标对象当前执行方法名
	String methodName = signature.getName();
	//当前请求对象
	ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
	HttpServletRequest request =servletRequestAttributes.getRequest();
	//获取请求IP地址
	String remoteinfo ="IP："+request.getRemoteAddr()+" 端口："+request.getRemotePort();
	ThreadContext.put("remoteinfo",remoteinfo);
	//打印日志
	Logger logger =LogManager.getLogger(className+"."+methodName);
	logger.info("耗时："+stopWatch.getLastTaskTimeMillis()+"（ms）");
	//清除和关闭当前线程ThreadContext
	ThreadContext.clearAll();
	ThreadContext.cloneStack();
    }



}
