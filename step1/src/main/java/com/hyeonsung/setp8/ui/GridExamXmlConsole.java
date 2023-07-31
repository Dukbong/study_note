package com.hyeonsung.setp8.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hyeonsung.setp8.entity.ExamXmlTest;

@Component("ConsoleId")
// xml에서 id값을 부여하는 것과 같은 역할을 한다.
// 만약 이걸 빼면 찾을때 근거가 될 자료형으로 찾으면 된다.
public class GridExamXmlConsole implements ExamXmlConsole {

	@Autowired
	private ExamXmlTest examXmlTest;
	
	public GridExamXmlConsole() {}
	public GridExamXmlConsole(ExamXmlTest examXmlTest) {
		this.examXmlTest = examXmlTest;
	}

	public void setExamXmlTest(ExamXmlTest examXmlTest) {
		this.examXmlTest = examXmlTest;
	}
	
	@Override
	public void print() {
		System.out.println("-------------------");
		System.out.println("|  total  |  avg  |");
		System.out.println("-------------------");
		System.out.printf("|  %4d  |  %3.2f  |\n", examXmlTest.total(), examXmlTest.avg());
		System.out.println("-------------------");
	}
}
