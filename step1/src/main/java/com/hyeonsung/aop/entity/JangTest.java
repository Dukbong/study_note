package com.hyeonsung.aop.entity;

public class JangTest implements Test{
	
	private int java;
	private int js;
	private int python;
	
	public JangTest() {
		super();
	}

	public JangTest(int java, int js, int python) {
		super();
		this.java = java;
		this.js = js;
		this.python = python;
	} 
	

	@Override
	public int total() {
		// Java로 AOP 직접 만들기 (전)=================
//		long start = System.currentTimeMillis();
		//======================================
		
		// 실제 코드~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		int result = java + js + python;
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		//------------------------------------------
		// 그냥 시간때문에 넣어둔 것이며 AOP와는 상관 없다.
		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//------------------------------------------
		
		// Java로 AOP 직접 만들기 (전)==============
//		long end = System.currentTimeMillis();
//		String message = (start - end) + "s...";
//		System.out.println(message);
		//===================================
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
