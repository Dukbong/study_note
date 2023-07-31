package com.hyeonsung.setp9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.hyeonsung.setp9.ui.ExamXmlConsole;

public class Program {
	public static void main(String[] args) {
		// ApplicationContext는 총 4가지가 있는데
		// ProgramConfig처럼 어노테이션으로 만든 경우는 AnnotationConfigApplicationContext를 사용한다.
		ApplicationContext context = new AnnotationConfigApplicationContext(ProgramConfig.class);
		/*
		 * 여러개의 @Configuration을 등록하려면
		 * 기본 생성자로 AnnotationConfigApplicationContext를 생성한후
		 * register 메소드를 사용해서 추가할 수 있다.
		 * 예를 들어 
		 * context.register(Test1.class), context.refister(Test2.class)...
		 * 또는 context.register(Test1.class, Test2.class...)
		 * 다 작성 후 context.refresh()를 통해 ioc컨테이너에 있는 객체들을 사용할 수 있게 됩니다. 
		 * 
		 * */
		ExamXmlConsole console1 = (ExamXmlConsole) context.getBean("ConsoleId");
		console1.print();
	}
}
