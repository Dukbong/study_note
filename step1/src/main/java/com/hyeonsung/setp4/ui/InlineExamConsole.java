package com.hyeonsung.setp4.ui;

import com.hyeonsung.setp4.entity.Exam;

public class InlineExamConsole implements ExamConsole {

	private Exam exam;
	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
	}
	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f", exam.total(), exam.avg());
	}

}
