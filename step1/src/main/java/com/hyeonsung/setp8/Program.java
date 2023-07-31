package com.hyeonsung.setp8;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hyeonsung.setp8.ui.ExamXmlConsole;

public class Program {
	// 어노테이션을 사용하기
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hyeonsung/setp8/setting.xml");
		ExamXmlConsole console1 = (ExamXmlConsole) context.getBean("ConsoleId");
		//ExamXmlConsole console1 = context.getBean(ExamXmlConsole.class);
		console1.print();
	}
}
