package graphics;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

public class ImageViewEx1 extends MFrame{
	
	Image img;
	
	public ImageViewEx1() {
		super(550, 400);
		//메모리 로딩
		img = Toolkit.getDefaultToolkit().getImage("graphics/aaa0.png");
	}
	
	//컨테이너 객체가 생성되고 필요한 리소스(컴포넌트, 이미지) 그리는 메소드 (반복호출)
	@Override
	public void paint(Graphics g) {
		//System.out.println("paint");
		g.drawImage(img, 0, 0, this);
	}
	
	public static void main(String[] args) {
		new ImageViewEx1();
	}
}