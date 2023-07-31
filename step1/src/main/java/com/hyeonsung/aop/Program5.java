package com.hyeonsung.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hyeonsung.aop.entity.Test;

public class Program5 {

	public static void main(String[] args) {
		// Poing Cut, Join Point, Weaving
		// 별도로 지정해주지 않으면  Proxy는 모든 메소드를 Join Point로 생각한다.
		
		/*
		 * Join Point
		 * --> Cross-cutting-concern이 결합될 수 있는 모든 상황 (메서드 호출등)
		 * 
		 * Point Cut
		 * --> Cross-cutting-concern이 결합 될 특정 Joint Point을 선언*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hyeonsung/aop/setting5.xml");
		
		Test test = (Test) context.getBean("proxy");
		System.out.println("total : " + test.total());
		System.out.println("avg   : " + test.avg());
	}

}
