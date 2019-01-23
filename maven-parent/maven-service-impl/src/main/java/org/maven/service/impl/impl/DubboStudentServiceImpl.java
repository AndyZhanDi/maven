package org.maven.service.impl.impl;

import org.maven.service.provider.DubboStudentService;

import com.alibaba.dubbo.config.annotation.Service;
@Service
public class DubboStudentServiceImpl implements DubboStudentService{

	@Override
	public String getName(Integer studentId) {
		// TODO Auto-generated method stub
		return "zhangsan";
	}

}
