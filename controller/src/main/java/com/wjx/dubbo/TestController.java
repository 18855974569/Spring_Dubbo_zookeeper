package com.wjx.dubbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.wjx.dubbo.service.TestService;

@RestController
public class TestController {

	@Autowired
	TestService testService;
	
	
	@RequestMapping("hello")
	@ResponseBody
	public String hello(){
		String string = testService.hello();
		return string;
	}
}
