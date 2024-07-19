package ch06;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MFrame2 extends Frame{
	
	public MFrame2(){
		setSize(300, 300);
		setBackground(Color.BLUE);
		setResizable(false);
		setVisible(true);
		//종료기능 이벤트 추가
				addWindowListener(new WindowAdapter() {
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					}
				});
				validate();
	}

	public static void main(String[] args) {
		
	}

}
