package com.hyeonsung.setp6;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hyeonsung.setp6.entity.ExamXmlTest;

// 컬렉션 생성 및 목록 DI
public class Program {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hyeonsung/setp6/setting.xml");
		
		List<ExamXmlTest> list1 = (List<ExamXmlTest>) context.getBean("arrayList1");
		
		for(ExamXmlTest e : list1) {
			System.out.println(e);
		}
		
		System.out.println("-------------------");
		
		List<ExamXmlTest> list2 = context.getBean(ArrayList.class);
		
		for(ExamXmlTest e : list2) {
			System.out.println(e);
		}
	}
}
