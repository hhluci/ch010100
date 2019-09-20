package com.bee.sample.ch1.rest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * 
 * @author hhluci
 *
 */
@RestController //处理Rest方式的web请求
public class UserReditRestController {

	@RequestMapping(value="/usercredit/{id}") 
	//处理web请求的url,http://localhost:8080/usercredit/123,123是参数id的值
	public Integer getCreditLevel(@PathVariable String id) {  //接收路径参数	
		return 3;
		
	}
}
