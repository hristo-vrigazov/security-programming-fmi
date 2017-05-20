package com.security.fmi;

import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;

@Component
public class HelloWorldAction extends ActionSupport {

	private static final long serialVersionUID = -3040983642542454121L;

	public String display() {
		return NONE;
	}

}