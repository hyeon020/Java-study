package ch06;

class Super{
	String name;
	void prn() {
		System.out.println("Name : " + name);
	}
}

class Sub extends Super{
	int name;
	@Override
	void prn() {
		System.out.println("Super name : " + super.name);
		System.out.println("Name : " + this.name);
	}
}

public class ThisEx3 {

	public static void main(String[] args) {
		Sub sub = new Sub();
		sub.prn();
		//문제. 이 위치에서 Sub클래스의 this, super라는 키워드 사용가능? (불가능)
		//sub 레퍼런스 변수로 Super 클래스 prn 호출 가능 불가능 -> 불가능
	}

}
