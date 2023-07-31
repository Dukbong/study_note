package com.hyeonsung.setp7.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.hyeonsung.setp7.entity.ExamXmlTest;

public class GridExamXmlConsole implements ExamXmlConsole {

	private ExamXmlTest examXmlTest;
	
	public GridExamXmlConsole() {}
	public GridExamXmlConsole(ExamXmlTest examXmlTest) {
		this.examXmlTest = examXmlTest;
	}

	// 자동으로 객체를 연결해주는 어노테이션
	// 무슨 근거로 해당 ExamXmlTest를 바인딩 해주는 걸까?
	// 우선 적으로는 자료형을 근거로 하지만 객체가 2개 이상일 경우 이름(id)을 근거로 바인딩한다.
	// 이때 자바 코드를 직접적으로 고치지 않기 위해서는 Qualifier 어노테이션으로 id값을 지정해서 바인딩 할 수 있다.
	@Autowired
	@Qualifier("examXmlTest1")
	public void setExamXmlTest(ExamXmlTest examXmlTest) {
		this.examXmlTest = examXmlTest;
	}
	// 이렇게 작성하면 setter를 호출한다.
	
	@Override
	public void print() {
		System.out.println("-------------------");
		System.out.println("|  total  |  avg  |");
		System.out.println("-------------------");
		System.out.printf("|  %4d  |  %3.2f  |\n", examXmlTest.total(), examXmlTest.avg());
		System.out.println("-------------------");
	}
}
