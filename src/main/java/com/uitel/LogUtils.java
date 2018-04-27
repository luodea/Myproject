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

	//��ȡĿ�����
	Signature signature = joinPoin.getSignature();
	//��ȡĿ���������
	String className = joinPoin.getTarget().getClass().getName();
	//��ȡĿ�����ǰִ�з�����
	String methodName = signature.getName();
	//��ǰ�������
	ServletRequestAttributes servletRequestAttributes = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
	HttpServletRequest request =servletRequestAttributes.getRequest();
	//��ȡ����IP��ַ
	String remoteinfo ="IP��"+request.getRemoteAddr()+" �˿ڣ�"+request.getRemotePort();
	ThreadContext.put("remoteinfo",remoteinfo);
	//��ӡ��־
	Logger logger =LogManager.getLogger(className+"."+methodName);
	logger.info("��ʱ��"+stopWatch.getLastTaskTimeMillis()+"��ms��");
	//����͹رյ�ǰ�߳�ThreadContext
	ThreadContext.clearAll();
	ThreadContext.cloneStack();
    }



}
