package com.hyeonsung.setp5.ui;

import com.hyeonsung.setp5.entity.ExamXmlTest;

public class GridExamXmlConsole implements ExamXmlConsole {

	private ExamXmlTest examXmlTest;
	
	public GridExamXmlConsole(ExamXmlTest examXmlTest) {
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
