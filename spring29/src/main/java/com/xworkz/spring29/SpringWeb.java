package com.xworkz.spring29;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringWeb extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		System.out.println("running in getRootConfigClasses");
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		System.out.println("running in getServletConfigClasses");
		return null;
	}

	@Override
	protected String[] getServletMappings() {
		System.out.println("running in getServletMappings");
		return null;
	}

}
