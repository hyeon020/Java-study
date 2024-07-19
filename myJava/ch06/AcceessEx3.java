package ch06;

import java.awt.Frame;

//jdk에서 지원되는 클래스의 메소드 중에 protected 시용하는 방법
class MyFrame extends Frame{
	public MyFrame() {
		setSize(200, 200);
		setLocation(100, 200);
		setVisible(true);
	}
	
	public void prn() {
		System.out.println(paramString());
	}
}
public class AcceessEx3 {
	public static void main(String[] args) {
		MyFrame mf = new MyFrame();
		mf.prn();
	}

}
