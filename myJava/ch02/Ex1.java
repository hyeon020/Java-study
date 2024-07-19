package ch02;

public class Ex1 {

	public static void main(String[] args) {
		
		//변수의 선언 : 프로그램 실행 필요한 값들을 저장하기 위한 문법
		int a; //반드시 타입부터 선언
		a=10; //변수에 값(value) 대입
		// int b=3.14; //value는 반드시 타입과 일치
		String str= "자바"; //문자열 
		System.out.println(a);
		System.out.println(str);
		
		int x, y, z;
		x=10;
		System.out.println(x);
		
		//int 형의 범위를 구하시오.
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MAX_VALUE);
	}
}