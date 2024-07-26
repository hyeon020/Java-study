package ch08;

interface Calc{
	//추상메소드 : abstract는 사용하지 않아도 자동으로 됨.
	void plus(int a, int b);
}

class Function extends Object implements Calc{
	@Override
	public void plus(int a, int b) {}
}

class Graphic implements Calc{
	@Override
	public void plus(int a, int b) {
	}
}

public class Interface {

	public static void main(String[] args) {

	}

}
