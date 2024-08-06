package ch12;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import awt.MFrame;

public class RunnableFrameEx1 extends MFrame implements Runnable {
	
	Color c;
	int x, y;
	Random r = new Random();
	
	public RunnableFrameEx1(Color c) {
		super(300, 300);
	}
	@Override
	public void run() {
		try {
			for(int i=0; i<20; i++) {
				x = r.nextInt(300);
				y = r.nextInt(300);
				Thread.sleep(500); //0.5초
				repaint(); //update호출
			}
		}catch (Exception e) {}
	}
	
	//reapaint -> update -> paint
	@Override
	public void update(Graphics g) {
		g.clearRect(x, y, 10, 10);
		paint(g);
	}
	
	@Override
	public void paint(Graphics g) {
		g.setColor(c);
		g.fillOval(x, y, 10, 10);
	}

	public static void main(String[] args) {
		RunnableFrameEx1 f1 = new RunnableFrameEx1(Color.PINK);
		RunnableFrameEx1 f2 = new RunnableFrameEx1(Color.GREEN);
		new Thread(f1).start();
		new Thread(f2).start();
	}

}
