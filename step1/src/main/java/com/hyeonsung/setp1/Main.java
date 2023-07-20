package com.hyeonsung.setp1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		
		// 목표 : 객체를 손쉽게 바꾸는 방법
		
		FileInputStream fis = new FileInputStream("src/main/java/com/hyeonsung/setp1/setting/TestSetting.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		String className = br.readLine();
		isr.close();
		br.close();
		fis.close();
		
		try {
			Xinterface x = (Xinterface) Class.forName(className).newInstance();
			x.total(); 
		} catch (InstantiationException e) {
			System.out.println("객체 생성에 실패하였습니다.");
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			System.out.println("객체 호출에 실패하였습니다.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을 수 없습니다.");
			e.printStackTrace();
		}
	}
}
