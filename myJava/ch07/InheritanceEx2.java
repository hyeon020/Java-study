package ch07;

import java.io.IOException;

class Super2{
	
	void prn1() {}
	//private 선언된 메소드는 오버라이딩 불가
	protected void prn2() {}
	void prn3() throws IOException {}
}

class Sub2 extends Super2{
	//@Override
	void prn1(int a) {}
	
	//Super 클래스의 메소드 보다 같거나 더 넓은 접근지정자
	@Override 
	public void prn2() {}
	//같은 예외객체 throws 해야됨.
	@Override
	void prn3() throws IOException {}
}

public class InheritanceEx2 {

	public static void main(String[] args) {

	}

}
