package com.fjodor.hello.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.MDC;

public class AuditFilter implements Filter {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {

		// Get the parameter value.
		//final String parameter = request.getParameter("clientName");
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		
//		final String parameter = httpRequest.getServerName();
//		final String requestHost = httpRequest.getHeader("Host");

		// Put it in the MDC map.
//		MDC.put("clientName", parameter);
//		
//		MDC.put("user", "Liu Fujun");
//		MDC.put("user", "Liu Fjodor");
		
		final String user = "TODO-USER";
        final String requestHost = httpRequest.getHeader("Host");
        final String requestURI = httpRequest.getRequestURI();
        final String requestMethod = httpRequest.getMethod();
        //final int responseStatus = httpResponse.getStatus();
        
        MDC.put("HOST", requestHost);
        MDC.put("URI", requestURI);
        MDC.put("METHOD", requestMethod);
       // MDC.put("STATUS", String.valueOf(responseStatus));
        MDC.put("USER", user);

//		System.out.println("^^^^^^^^^^^^^^^^^^^^^" + requestHost);
		
		try {
			chain.doFilter(request, response);
		} finally {
			// When the control returns to the filter, clean it.
			MDC.remove("clientName");
		}

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
