package example3;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AopMain {
	public static void main(String[] args) {
		
		AbstractApplicationContext context = 
				new GenericXmlApplicationContext("aopExam.xml");
		
		System.out.println("---게시물 등록 하기---");
		Board myboard = (Board)context.getBean("myboard");
		myboard.board(); // 핵심기능 
	}
}
/*
로그인수행
안녕하세요
DB 작업 수행함
게시물 등록 하기:핵심기능
로그아웃 수행
*/


