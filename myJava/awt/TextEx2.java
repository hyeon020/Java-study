package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextEx2 extends MFrame implements ActionListener {
	TextArea ta;
	TextField tf;
	Button btn;
	
	public TextEx2() {
		super(300, 300);
		setTitle("MyChat v1.0");
		//NEWS
		setLayout(new BorderLayout());
		add(ta = new TextArea());
		ta.setEditable(false);
		Color c[] = MColor.rColor2();
		ta.setBackground(c[0]);
		ta.setForeground(c[1]);
		//그룹 컨테이너
		Panel p = new Panel();
		p.add(tf = new TextField(22));
		p.add(btn = new Button("SEND"));
		tf.addActionListener(this);
		btn.addActionListener(this);
		add(p, BorderLayout.SOUTH);
		validate();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = tf.getText().trim();//공백제거
		if(str.length()==0) {
			str = "입력을 하세요.!!!";
		ta.append(str+"\n");
		tf.setText("");
		tf.requestFocus();
		}
	}
	public static void main(String[] args) {
		new TextEx2();
	}

}
