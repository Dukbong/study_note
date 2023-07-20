package com.hyeonsung.setp4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hyeonsung.setp4.entity.Exam;
import com.hyeonsung.setp4.entity.JangExam;
import com.hyeonsung.setp4.ui.ExamConsole;
import com.hyeonsung.setp4.ui.ExamXmlConsole;
import com.hyeonsung.setp4.ui.GridExamConsole;
import com.hyeonsung.setp4.ui.InlineExamConsole;

public class Program {
	public static void main(String[] args) {
		Exam exam = new JangExam();
		
		// 1. 직접 DI 해보기
		ExamConsole console1 = new InlineExamConsole(exam);
		ExamConsole console2 = new GridExamConsole(exam);
		
		console1.print();
		System.out.println("\n============");
		console2.print();

		
		// 2. new 연산자를 외부 세팅으로 설정하기
		// 하는 이유 DI 변경시 자동으로 하기 위해서다.
		/* 해당 부분을 지시하는 방법으로 코드를 변경한다.
		ExamXmlTest examXmlTest = new jangExamXmlTest();
		ExamXmlConsole console3 = new InlineExamXmlConsole(examXmlTest);
		ExamXmlConsole console4 = new GridExamXmlConsole(examXmlTest);
		*/
		ApplicationContext context = new ClassPathXmlApplicationContext("com/hyeonsung/setp4/setting.xml");
		// ApplicationContext의 종류
		// 1. ClassPathXmlApplicationContext : 루트로 부터 시작
		// 2. FileSystemXmlApplicationContext : C드라이브 어디어디 실제 위치
		// 3. XmlWebApplicationContext : web에 두어 url을 통해
		// 4. AnnotationConfigApplicationContext : 스캔하여 특정 어노테이션 확인
//		ExamXmlConsole console5 = (ExamXmlConsole) context.getBean("examXmlConsole"); // 형변환 필수
		ExamXmlConsole console6 = context.getBean(ExamXmlConsole.class);
		
//		console5.print();
		console6.print();
	}
}
