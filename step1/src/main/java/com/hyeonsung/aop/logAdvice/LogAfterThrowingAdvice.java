package com.hyeonsung.aop.logAdvice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice {

	// AOP가 적용될 메소드가 에러가 발생하거나 Exception을 던질떄 실행
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("예외가 발생하였습니다. : " + e.getMessage());
	}
}
