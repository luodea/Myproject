package com.common;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet Filter implementation class Myfilter
 */
public class Myfilter implements Filter {

    /**
     * Default constructor. 
     */
    public Myfilter() {
       System.out.println(">>>>>>>>>>ִ�й��캯��");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	    System.out.println(">>>>>>>>>>ִ�����ٷ���");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	    System.out.println(">>>>>>>>>>ִ�й����߼�");
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	    System.out.println(">>>>>>>>>>ִ�г�ʼ������");
	}

}
