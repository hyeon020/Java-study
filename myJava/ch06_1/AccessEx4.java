package ch06_1;

class Access4{
	private int a;
	//같은 package에서는 public 개념이다.
	protected int b;
	public int c;
}

public class AccessEx4 {
	
	private int a;
	//같은 package에서는 public 개념이다.
	protected int b;
	public int c;
	
	public static void main(String[] args) {
		Access4 ac = new Access4();
		ac.b = 10;
		ac.c = 20;
	}

}