package ch03;

public class Ex7 {

	public static void main(String[] args) {
		//조건(삼항)연산자 : 리턴값이 동적으로 세팅가능
		int a = 10;
		if(a%2==0)System.out.println("짝수");
		else System.out.println("홀수");
		String str = (a%2==0)?"짝수":"홀수";
		System.out.println(str);
		//리턴값이 있는 메소드는 반드시 강제적으로 값을 받을 필요는 없다
		int b = Math.min(10, 20);
		int c = 10;
		int d = 20;
		int e = d > c ? d : c;
		System.out.println(e);
		//삼항연산자를 이용해서 절대값 리턴
		int f = -20;
		int g = f>0?f:-f;
		System.out.println(g);
		System.out.println(Math.abs(f));
	}

}
