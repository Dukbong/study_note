package com.hyeonsung.setp8.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
// 하지만 실제로 MVC패턴 사용시 Component보다는 Controller, Service, Repository로 나누는게 좋다.
public class JangExamXmlTest implements ExamXmlTest{
	
	// Value 어노테이션을 사용하여 초기화 할 수 있다.
	@Value("20")
	private int java;
	@Value("30")
	private int js;
	@Value("40")
	private int python;
	
	public JangExamXmlTest() {
		super();
	}

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
