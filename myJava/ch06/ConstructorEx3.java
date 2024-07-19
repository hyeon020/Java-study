package ch06;

import java.awt.Frame;

class Super3 extends Object{
	Super3(){
	    /*생략(반드시 생성자의 첫번째 라인 -> 
		내 객체가 만들어지기 전에 부모클래스 객체가 먼저 만들어 져야 함*/
		super(); //Object생성자 호출
		System.out.println("Super3 생성자"); //만약 super()위에 이게 있으면 에러
	}
}

class Sub3 extends Super3{
	Sub3() {
		super(); //이 super()는 Super3의 디폴트생성자
		System.out.println("Sub3 생성자");
	}
}

public class ConstructorEx3 {

	public static void main(String[] args) {
		//Super3 s1 = new Super3();
		Sub3 s3 = new Sub3();
		Frame f = new Frame();
	}

}
