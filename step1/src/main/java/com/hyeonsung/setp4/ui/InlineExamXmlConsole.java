package com.hyeonsung.setp4.ui;

import com.hyeonsung.setp4.entity.ExamXmlTest;

public class InlineExamXmlConsole implements ExamXmlConsole {

	private ExamXmlTest examXmlTest;
	
	public InlineExamXmlConsole(ExamXmlTest examXmlTest) {
		this.examXmlTest = examXmlTest;
	}
	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f", examXmlTest.total(), examXmlTest.avg());
	}
}
