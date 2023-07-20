package com.hyeonsung.setp3;

// IOC : Inversion Of Control
// 작은것을 만들고 큰것에 조립한다고 생각하면 좋다.
// - 의존관계 설정, 생명주기를 해결하기 위한 디자인 패턴이다.
// - IOC 컨테이너는 Spring이 객체 생성, 의존성 관리를 대신 해주는 것을 말한다.
public class IocStudy {

	// 일체형 
	// 생성과정 : A -> B -> C
	// 현재 참조변수 a는 B와 C객체를 가지고 있다.
	A a = new A();
	
	// 조립형
	// 생성과정 : CC -> BB -> AA
	// 이런식으로 역순으로 만들어지는 것을 IOC라고 한다.
	// 
	CC cc = new CC();
	BB bb = new BB(cc);
	AA aa = new AA(bb);
	
}


// 일체형
class A{
	private B b;
	public A() {
		b = new B();
	}
}
class B{
	private C c;
	public B() {
		c = new C();
	}
}
class C{}


// 조립형
class AA{
	private BB bb;
	
	public AA(BB bb) {
		this.bb = bb;
	}
}
class BB{
	private CC cc;
	public BB(CC cc) {
		this.cc = cc;
	}
}
class CC{}