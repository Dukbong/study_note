package com.hyeonsung.setp7;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hyeonsung.setp7.ui.ExamXmlConsole;

public class Program {
	// 어노테이션을 사용하기
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hyeonsung/setp7/setting.xml");
		ExamXmlConsole console1 = (ExamXmlConsole) context.getBean("examXmlConsole1");
		console1.print();
		ExamXmlConsole console2 = (ExamXmlConsole) context.getBean("examXmlConsole2");
		console2.print();
		
	}
}
