package com.hyeonsung.setp2;

public class DiStudy {
	
	public void show() {		
		B b = new B();
		AA a1 = new AA();
		
		// Setter Injection
		a1.setB(b); 
		
		// Construction Injection
		// 가장 좋은 방법이다.
		AAA a2 = new AAA(b); 
	}
}
// 결론 : 일체형보다 조립형이 유지보수등에 더 효율적이다.

// case 1 (일체형)
// - B는 A의 Dependency(부품)이다.
class A{
	private B b;
	
	public A() {
		b = new B();
	}
}


// case 2 (조립형) --> 이게 Dependency Injection
// - 이렇게 외부에서 만든 객체를 이용하는 방법이 Dependency Injection이다.
// - Setter Injection
class AA{
	private B b;
	
	public void setB(B b) {
		this.b = b;
	}
}
// - Construction Injection
class AAA{
	private B b;
	
	public AAA(B b) {
		this.b = b;
	}
}



class B{}