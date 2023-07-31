package com.hyeonsung.aop.logAdvice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import com.hyeonsung.aop.entity.JangTest;

public class LogBeforeAdvice implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("앞에서 실행되는 로직");
	}

}
