//도메인 뒤로 선언 : naver.com -> package com.naver.String
package ch06; 

//클래스 선언 : ch06.Car2
//클래스 : 객체를 만드는 틀(ex-붕어빵틀)
class Car2/*클래스명*/{
	//문제. new 연산자로 객체를 만들면 메소드 vs 필드(승)
	
	void stop() {
		int velocity = 0;
	}
	
	int velocity;
}

public class CarEx2 {
	public static void main(String[] args) {
		int a= 10;
		int b = a; //기본형타입 : call by value
		a = 20;
		System.out.println(a + " : " + b);
		
		Car2 c1 = new Car2();
		Car2 c2 = new Car2();
		System.out.println(c1);
		System.out.println(c2);
		c1 = c2; //참조형 : call by reference
		System.out.println(c1);
		System.out.println(c2);
		System.out.println("-------------------");
		for(int i=0; i<10; i++) {
			Car2 c3 = new Car2();
			System.out.println(c3);
			
			//객체를 생성하는 이유는? 필드와 메소드 사용
			String str = new String("afsdfasdfas");
			System.out.println(str.toUpperCase());
			System.out.println(str.length());
			System.out.println(str.replace('a', 'x'));
			
			//객체 생성없이 클래스명으로 메소드 및 필드
			//32를 2진수로 출력
			System.out.println(Integer.toBinaryString(32));
		}
	}

}
