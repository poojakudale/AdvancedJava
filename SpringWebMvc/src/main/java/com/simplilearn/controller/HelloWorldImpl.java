package com.simplilearn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class HelloWorldImpl implements HelloWorld
{
	
	@RequestMapping(value="/helloweb", method=RequestMethod.GET)
	public String sayHello() {
		// TODO Auto-generated method stub
		return "index";
	}

}
