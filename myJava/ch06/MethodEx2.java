package ch06;

class Method2{
	
	Method2(){
		
	}
	/*메소드 오버로딩(Over loading) : 클래스 내에 동일한 메소드 명으로 매개변수 개수 타입을 달리해서 선언하고 기능 같음.*/
	void prn(int a) {
		System.out.println(a);
		return;//리턴값이 없어도 선언가능
	}
	
	void prn(int a, int b) {
		System.out.println(a + "\t" + b);
	}
	
	void prn(int a, int b, int c) {
		System.out.println(a + "\t" + b + "\t" + c);
	}
	
	/*가변인수*/
	void prnf(int...arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
	}
}
public class MethodEx2 {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(true);
		System.out.println("하하");
		System.out.println(3.14);
		
		Method2 m1 = new Method2();
		m1.prn(10);
		m1.prn(10, 20);
		m1.prn(10, 20, 30);
		//m1.prn(10, 20, 30, 40);
		m1.prnf(1);
		m1.prnf(1,2);
		m1.prnf(1,2,3);
		m1.prnf(1,2,3,4);
		m1.prnf(1,2,3,4,5);
		
		//모든 자바기본형 타입은 Wrapper 클래스 타입으로 자동변환
		System.out.printf("%s vs %d vs %f", "문자열", 22, 3.14);
	}

}
