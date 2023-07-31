package com.hyeonsung.setp9.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.hyeonsung.setp9.entity.ExamXmlTest;

@Component("ConsoleId")
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
