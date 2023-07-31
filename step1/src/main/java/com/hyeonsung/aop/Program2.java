package com.hyeonsung.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hyeonsung.aop.entity.Test;

public class Program2 {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hyeonsung/aop/setting.xml");
		Test proxy = (Test) context.getBean("proxy");
		 
		System.out.printf("total is %d\n", proxy.total());
		System.out.printf("avg is %f\n", proxy.avg());
	}
}
