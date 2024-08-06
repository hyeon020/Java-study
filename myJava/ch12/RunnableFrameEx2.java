package ch12;

import java.awt.*;
import java.util.*;

import awt.MFrame;

public class RunnableFrameEx2 extends MFrame {
	Color c;
	int x, y;
	Random r = new Random();

	public RunnableFrameEx2(Color c) {
		super(300, 300);
		this.c = c;
	}

	public void run() {
		try {
			for (int i = 0; i < 20; i++) {
				x = r.nextInt(300);
				y = r.nextInt(300);
				Thread.sleep(500);
				repaint(); // update 호출
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void start() {
		run();
	}

	// repaint -> update -> paint
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
		RunnableFrameEx2 f1 = new RunnableFrameEx2(Color.red);
		RunnableFrameEx2 f2 = new RunnableFrameEx2(Color.blue);
		f1.start();
		f2.start();
	}

}