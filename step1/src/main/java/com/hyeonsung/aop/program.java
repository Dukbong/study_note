package com.hyeonsung.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hyeonsung.aop.entity.JangTest;
import com.hyeonsung.aop.entity.Test;

public class program {
	// AOP는 방법론 중 하나이며 스프링은 이것을 도와줄 수 있다.
	// 관점 지향 프로그래밍
	// Aspect Oriented Programming
	
	// 사용자가 아닌 개발자나 관리자가 관리 및 개발을 위한 부가적인 코드들과 사용자에게 필요한 코드를
	// 분리하여 작성하는 방법이다. 
	
	// 예를 들어 로그처리, 보안처리, 트랜잭션처리 등이 있다.
	
	// 실행 전, 실제 실행, 실행 후 이렇게 3가지가 있다고 했을때
	// 기본적인 흐름은 A가 실행 전 을 호출하고 종료후 실제 실행을 호출하고 종료되면 실행 후가 실행되고 종료된다.
	// 실행 전, 호출 (실제 실행), 실행 후 순이다. 
	
	// 실행 전, 실행 후 코드는 Cross-cutting-Concern이라고 부른다.
	// 실제 실행 코드는 Core-Concern이라고 부른다.
	public static void main(String[] args) {
		
		Test test = new JangTest(10,20,30);
		
		// 1. 직접 AOP를 자바로 구현해보기
		// Proxy 만들기
		Test proxy = (Test)Proxy.newProxyInstance(/*실제 실행되야 하는 객체*/JangTest.class.getClassLoader(),
				/*인터페이스 배열 형태*/new Class[] {Test.class},
				/*핸들러 가장 중요*/new InvocationHandler() {
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				long start = System.currentTimeMillis();
				
				// 실제 코드에 있는 메소드를 호출하기 위함이다.
				Object result = method.invoke(test, args);
				// args >> 실제 객체에 있는 메소드들이 가져야 할 매개변수를 다 가져오기 때문에 넣어줘야한다.
				// 현재 테스트해 볼 JangTest의 total은 return값이 있기 때문에 반환 값을 저장해준다.
				
				long end = System.currentTimeMillis();
				String message = (end-start) + "ms 걸렸습니다 (proxy)";
				System.out.println(message);
				return result;
			}
		});
		
		System.out.println("Cross-cutting-Concern");
		System.out.printf("total is %d\n", proxy.total());
		
		System.out.println("------------------------------");
		
		System.out.println("Core-Concern");
		System.out.printf("total is %d\n", test.total());
	}
}
