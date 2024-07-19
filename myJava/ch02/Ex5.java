package ch02;

public class Ex5 {
	public static void main(String[] args) {
		/*Data Type : 기본형(8개) + 참조형(class 타입) 
		  : SUN + 외부 lib*+현재 선언한 클래스*/
		int a = 10;
		//클래스 : 객체를 만드는 틀 ->필드(객체속성) 및 메소드(객체기능)
		//String 클래스 : 문자열 객체화 ex) 문자열길이 : length()
		//Math 클래스 : 수학을 객체화 ex) PI(원주율 필드), 올림, 내림, 반올림, 절대값
		String str = "asfadfas";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		//반지름이 5인 원의 넓이를 구하시오.
		System.out.println(5*5*Math.PI);
		System.out.println(5*5*3.14);
	}
}
