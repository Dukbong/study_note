package com.hyeonsung.setp6.entity;


// 변수를 DI하는 방법은 set을 이용한 방법과 생성자(3가지)를 이용한 방법이 있다.
public class JangExamXmlTest implements ExamXmlTest {
	private int java;
	private int js;
	private int python;
	
	public JangExamXmlTest() {
		super();
	}

	// 생성자를 이용한 DI
	public JangExamXmlTest(int java, int js, int python) {
		super();
		this.java = java;
		this.js = js;
		this.python = python;
	}
	

	@Override
	public int total() {
		return java+js+python;
	}

	@Override
	public double avg() {
		return total()/3.0;
	}

	// Setter의 경우 set을 이용한 DI
	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getJs() {
		return js;
	}

	public void setJs(int js) {
		this.js = js;
	}

	public int getPython() {
		return python;
	}

	public void setPython(int python) {
		this.python = python;
	}

	@Override
	public String toString() {
		return "JangExamXmlTest [java=" + java + ", js=" + js + ", python=" + python + "]";
	}
	
	
}
