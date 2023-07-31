package com.hyeonsung.aop.entity;

public class JangTestException implements Test{
	
	private int java;
	private int js;
	private int python;
	
	public JangTestException() {
		super();
	}

	public JangTestException(int java, int js, int python) {
		super();
		this.java = java;
		this.js = js;
		this.python = python;
	} 
	

	@Override
	public int total() {
		int result = java + js + python;
		if(js > 100) {
			throw new IllegalArgumentException("유효하지 않은 자바스크립트 점수");
		}
		
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public double avg() {
		
		double result = total()/3.0;
		
		return result;
	}

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
