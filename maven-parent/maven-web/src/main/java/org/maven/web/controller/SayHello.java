package org.maven.web.controller;

import org.maven.service.provider.DubboStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;

@RestController
@RequestMapping(value = "/sayhello")
public class SayHello {
	
	@Reference
	private DubboStudentService dubboStudentService;
	
	
	@RequestMapping(value = "/hello")
	public String sayHello(){
		String name =dubboStudentService.getName(123);
		return "Hello world!" +name;
	}
}
