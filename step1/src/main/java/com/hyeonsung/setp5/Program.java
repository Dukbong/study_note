package com.hyeonsung.setp5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hyeonsung.setp5.entity.ExamXmlTest;
import com.hyeonsung.setp5.entity.JangExamXmlTest;
import com.hyeonsung.setp5.ui.ExamXmlConsole;

public class Program {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hyeonsung/setp5/setting.xml");
		ExamXmlConsole console6 = context.getBean(ExamXmlConsole.class);
		
		console6.print();
	}
}
