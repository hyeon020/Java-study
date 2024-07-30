package awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Label;
import java.awt.Panel;

public class DesignEx1 extends MFrame2 {
	
	Label label;
	Checkbox cb1, cb2, cb3;
	CheckboxGroup cbg;
	Button btn1, btn2;
	
	public DesignEx1() {
		super(250, 150);
		setTitle("������ ����1");
		
		label = new Label("�����߿� ����",Label.CENTER);
		label.setBackground(Color.green);
		cbg = new CheckboxGroup();
		Panel p1 = new Panel();
		p1.add(cb1=new Checkbox("���",cbg,false));
		p1.add(cb2=new Checkbox("����",cbg,false));
		p1.add(cb3=new Checkbox("�޵�",cbg,false));
		
		Panel p2 = new Panel();
		p2.add(btn1=new Button("Start"));
		p2.add(btn2=new Button("End"));
		add(p1);
		add(label, "North");
		add(p2,"South");
		validate();
	}	

	public static void main(String[] args) {
		new DesignEx1();
	}

}

