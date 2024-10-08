package event;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventEx3 extends MFrame {
	Button btn;
	
	public EventEx3() {
		add(btn = new Button("버튼3"), BorderLayout.SOUTH);
		//이벤트 리스너 객체
		MyAction ma = new MyAction();
		btn.addActionListener(ma);
	}
	
	class MyAction implements ActionListener {
		@Override
		public void actionPerformed(ActionEvent e) {
			//버튼을 클릭하면 Frame 배경색과 버튼의 배경색이 랜덤 변경
			setBackground(MColor.rColor());
			btn.setBackground(MColor.rColor());
		}
	}
	
	public static void main(String[] args) {
		new EventEx3();
	}

}
