package com.clonetab.rest.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CORSFilter implements Filter {
	
     public void init(FilterConfig filterConfig) throws ServletException {

     }

     public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
         HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
         System.out.println("Inside filter.....");
         HttpServletRequest httpRequest = (HttpServletRequest)servletRequest;
         
         
         //httpResponse.setHeader("Access-Control-Allow-Origin", "*");
	     //httpResponse.setHeader("Access-Control-Allow-Methods", "POST, GET, PUT, OPTIONS, DELETE");
	     //httpResponse.setHeader("Accept", "application/json");
         httpResponse.setHeader("Content-Type", "application/json");
     	 httpResponse.setHeader("Access-Control-Allow-Headers", "Access-Control-Allow-Origin,Access-Control-Allow-Methods,Content-Type");
	     httpResponse.setHeader("Access-Control-Expose-Headers", "custom-header1, custom-header2");
     	 httpResponse.setHeader("Access-Control-Allow-Credentials", "false");
	     httpResponse.setHeader("Access-Control-Max-Age", "4800");
	    // httpResponse.setContentType(MediaType.APPLICATION_JSON_VALUE);
	     
	     
	     System.out.println("---CORS Configuration Completed---");
	     filterChain.doFilter(httpRequest, httpResponse);
     }

     public void destroy() {

     }
}
