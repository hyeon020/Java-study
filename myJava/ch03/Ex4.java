package ch03;

public class Ex4 {

	public static void main(String[] args) {
		//괄호안에 있는 것은 무조건 : 메소드명()
		//괄호안에 들어가는 변수 : 매개변수(인수, 인자, arguments)
		//비교연산자 : 결과값이 반드시 boolean
		
		int a = 10;
		int b = 2;
		//== : 자바기본형은 값을 비교(vs) equals
		System.out.println(a==b); //eq
		System.out.println(a!=b);//*, ! : ne
		System.out.println(a>b);
		System.out.println(a>=b);
		System.out.println(a<b);
		System.out.println(a<=b);
	}

}
