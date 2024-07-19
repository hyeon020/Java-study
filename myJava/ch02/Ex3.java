package ch02;

public class Ex3 {

	public static void main(String[] args) {
		//데이터타입(Data Type) : 기본형(8개) + 참조형(무한대)
		//정수형(4)
		byte b = 10;
		short s= 10;
		int i = 20; //기본형
		long l = 10;
		
		//실수형(2)
		float f = 3.14F; //리터럴값에 뒤에 F/f 반드시 표기 
		double d = 3.14; //기본형
		
		//문자형(1)
		char c = 'A';
		char c1 = '자';
		String /*참조형*/ str = "자바"; //문자열

		//블린형(1)
		boolean b1 = true; //
		//////////////////////////
		//short
		System.out.println(Short.MAX_VALUE);
		short s1 = (short)32768;
		System.out.println(s1);
		//크기의 변화에 대해서 명시적, 묵시적 형변환
		int i2 = 200;
		long l1 = i2; //묵시적 형변환
		
		long l3 = 300; //300억도 선언 가능
		int i3 = (int)l3; //명시적 형변환
		
	}

}
