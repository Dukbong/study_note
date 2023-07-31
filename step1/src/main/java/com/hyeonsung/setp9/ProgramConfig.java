package com.hyeonsung.setp9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hyeonsung.setp9.entity.ExamXmlTest;
import com.hyeonsung.setp9.entity.JangExamXmlTest;

@ComponentScan("com.hyeonsung.setp9.*")
@Configuration
public class ProgramConfig {
	
	@Bean
	// 여기서의 메서드명은 xml설정시 id값이며
	// ioc컨테이너에서 불리는 이름이다.
	public ExamXmlTest examXmlTest() {
		return new JangExamXmlTest();
	}
	// 위에서 어노테이션으로 만든것은 아래와 같다.
	// <bean id="examXmlTest" class="com.hyeonsung.set9.entity.JangExamXmlTest"/>

}
