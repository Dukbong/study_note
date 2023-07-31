package com.hyeonsung.aop.logAdvice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterReturningAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		System.out.println("AOP 적용 메서드가 에러 없이 성공적으로 실행된 경우 실행");
		System.out.println("returnValue = " + returnValue);
		System.out.println("method = " + method.getName());
	}

}
