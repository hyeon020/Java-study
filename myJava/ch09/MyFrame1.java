package ch09;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*버튼을 클릭하면 종료되는 기능을 내부클래스와 익명클래스를 사용하지 않는 방법*/

class MyAction implements ActionListener{
	MyFrame1 f;
	
	public MyAction(MyFrame1 f) {
		this.f = f;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.exit(0); //종료기능
		f.setBackground(MColor.rColor());
	}
}

public class MyFrame1 extends MFrame{
	
	Button btn;
	
	public MyFrame1() {
		btn = new Button("button1");
		add(btn, BorderLayout.NORTH);
		MyAction ma = new MyAction(this);
		btn.addActionListener(ma);
	}
	public static void main(String[] args) {
		new MyFrame1();
	}

}
