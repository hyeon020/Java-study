package ch08;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame  extends MFrame implements ActionListener {
	
	Button btn;
	
	public MyFrame() {
		btn = new Button("Button");
		setBackground(MColor.rColor());
		add(btn, BorderLayout.SOUTH);
		//MyFrame은 ActionListener 타입입니다.
		//버튼을 클릭하면 이벤트 핸들러가 호출
		btn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		setBackground(MColor.rColor());
	}
	public static void main(String[] args) {
		new MyFrame();
	}

}
