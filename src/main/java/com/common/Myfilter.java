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
       System.out.println(">>>>>>>>>>执行构造函数");
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
	    System.out.println(">>>>>>>>>>执行销毁方法");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	    System.out.println(">>>>>>>>>>执行过滤逻辑");
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
	    System.out.println(">>>>>>>>>>执行初始化方法");
	}

}
