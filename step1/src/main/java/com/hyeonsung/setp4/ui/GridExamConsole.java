package com.hyeonsung.setp4.ui;

import com.hyeonsung.setp4.entity.Exam;

public class GridExamConsole implements ExamConsole {
	private Exam exam;
	
	public GridExamConsole(Exam exam) {
		this.exam = exam;
	}
	@Override
	public void print() {
		System.out.println("-------------------");
		System.out.println("|  total  |  avg  |");
		System.out.println("-------------------");
		System.out.printf("|  %4d  |  %3.2f  |\n", exam.total(), exam.avg());
		System.out.println("-------------------");
	}

}
