package com.wjx.dubbo.serviceimpl;

import org.springframework.stereotype.Service;

import com.wjx.dubbo.service.TestService;


@Service("testServiceImpl")
public class TestServiceImpl implements TestService{

	
	@Override
	public String hello() {
		return "hello ,this is test";
	}

}
