package com.hyeonsung.setp4.entity;

public class JangExamXmlTest implements ExamXmlTest {
	private int java;
	private int js;
	private int python;
	
	@Override
	public int total() {
		return java+js+python;
	}

	@Override
	public double avg() {
		return total()/3.0;
	}
}
