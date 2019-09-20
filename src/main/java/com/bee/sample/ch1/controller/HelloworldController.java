package com.bee.sample.ch1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 *
 * @author hhluci
 *
 */
@Controller
public class HelloworldController {

	@RequestMapping("/say.html") 
	//处理的web请求的url,http://localhost:8080/say.html
	public @ResponseBody String say() { 
		//@ResponseBody //表示返回的是一个文本
		return "Hello Spring Boot";
	}
}
