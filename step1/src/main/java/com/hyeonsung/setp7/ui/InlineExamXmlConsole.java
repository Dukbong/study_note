package com.hyeonsung.setp7.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.hyeonsung.setp7.entity.ExamXmlTest;

public class InlineExamXmlConsole implements ExamXmlConsole {

	@Autowired(required = false)
	// required는 기본값이 true이며
	// false를 하면 xml파일에 해당 객체가 없어도 된다는 뜻이다.
	// 이걸 true로 두고 xml파일에 해당 객체가 없으면 바인딩할게 없기 때문에 오류가 난다.
	@Qualifier("examXmlTest2")
	private ExamXmlTest examXmlTest;
	// 이렇게 작성하면 기본생성자가 호출 되게 된다.
	
	// 만약 이렇게 기본생성자를 호출할것인데 기본생성자가 없다면 당연히 오류가 난다.
	// 아니면 매개변수 있는 생성자를 지워버리는 방법도 있다.
	
	public InlineExamXmlConsole() {
		System.out.println("Base Constructor");
	}
//	@Autowired
//	@Qualifier("examXmlTest1")
	// 이렇게 작성할 수 없는데 이는 매개변수 있는 생성자의 경우 매개변수가 여러개 일 수 있기 때문이다.
	// 여기서 Qualifier 어노테이션을 사용하고 싶다면 매개변수에 직접 작성해줘야한다. 
//	public InlineExamXmlConsole(
//								@Qualifier("examXmlTest1")ExamXmlTest examXmlTest1,
//								@Qualifier("examXmlTest2")ExamXmlTest examXmlTest2) {
//		System.out.println("Arg Constructor");
//		this.examXmlTest = examXmlTest1;
//	}
	
	public InlineExamXmlConsole(ExamXmlTest examXmlTest) {
		System.out.println("Arg Constructor");
		this.examXmlTest = examXmlTest;
	}

//	@Autowired
//	@Qualifier("examXmlTest2")
	public void setExamXmlTest(ExamXmlTest examXmlTest) {
		System.out.println("Setter");
		this.examXmlTest = examXmlTest;
	}
	
	@Override
	public void print() {
		if(examXmlTest == null) {
			System.out.println("ExamXmlTest가 null 입니다.");
		}else {			
			System.out.printf("%4d   %3.2f", examXmlTest.total(), examXmlTest.avg());
		}
	}
}
