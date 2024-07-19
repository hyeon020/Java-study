package ch06;

/*접근제어자 : 클래스, 필드, 메소드
 * 1.private(0.1%)
 * 2.protected(0.01%)
 * 3.public(99.9%)
 * 
 * */

class Access1{
	public int a = 0;//어디에서나 접근 가능
	protected int b = 0;//상속 또는 같은 package 일 때 가능
	private int c = 0;//자신의 클래스 안에서만 가능
}

/*AcceessEx1.java : 클래스명.java 선언된 클래스만 public이고 
다른 클래스(Access1)는 public 선언하면 안됨*/
public class AcceessEx1 {

	public static void main(String[] args) {

	}

}
