//도메인 뒤로 선언 : naver.com -> package com.naver.String
package ch06; 

//클래스 선언 : ch06.Car1
//클래스 : 객체를 만드는 틀(ex-붕어빵틀)
class Car1/*클래스명*/{
	//필드(field) : 객체의 속성 <- 무조건 ()없다. 소문자 시작. 카멜표기법
	String carName;
	int velocity;
	String carColor;
	
	//메소드(method) : 객체의 기능(동작) <- 무조건 () 있다. 소문자 시작. 카멜표기법
	void speedUp() {
		velocity++; //필드 호출 가능
	}
	
	void speedDown() {
		velocity--;
		if(velocity<0) 
			velocity = 0;
	}
	
	void stop() {
		velocity = 0;
	}
}

public class CarEx1 {
	public static void main(String[] args) {
		//클래스를 가지고 객체를 생성
		//붕어빵틀 -> 붕어빵
		Car1 c1; //객체를 가르키는 변수 <- 레퍼런스변수
		c1 = new Car1();
		c1.carName = "소나타";
		c1.carColor = "은색";
		c1.speedUp();
		System.out.println(c1.carName);
		System.out.println(c1.carColor);
		System.out.println(c1.velocity);
		//System.out.println(c1);
	}

}
