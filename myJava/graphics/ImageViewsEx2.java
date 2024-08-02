package graphics;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class ImageViewsEx2 extends MFrame implements ActionListener{
	
	Random r = new Random();
	
	Image img[] = new Image[3];
	Button btn[] = new Button[4];
	String str[] = {"첫번째", "두번째", "세번째", "랜덤"};
	int i=0;
	
	public ImageViewsEx2() {
		super(550, 300);
		Panel p = new Panel();
		p.setLayout(new GridLayout(4,1));
		for (int i = 0; i < btn.length; i++) {
			btn[i] = new Button(str[i]);
			btn[i].addActionListener(this);
			p.add(btn[i]);
		}
		add(p,BorderLayout.EAST);
		for (int i = 0; i < img.length; i++) {
			img[i] = Toolkit.getDefaultToolkit().getImage("graphics/aaa"+i+".PNG");
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==btn[0]) {
			i = 0;
		}
		else if(obj==btn[1]) {
			i=1;
		}
		else if(obj==btn[2]) {
			i=2;
		}
		else if(obj==btn[3]) {
			i=r.nextInt(3); //범위가 0~2
		}
		setTitle("graphics/aaa" + i + ".PNG");
		repaint(); //내부적으로 paint()메소드 호출
	}
	
	@Override
	public void paint(Graphics g) {
		g.drawImage(img[i], 0, 0, this);
	}
	
	public static void main(String[] args) {
		new ImageViewsEx2();
	}
}