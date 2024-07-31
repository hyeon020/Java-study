package event;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Panel;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class EventEx6 extends MFrame{
	
	Checkbox red, green, cyan;
	CheckboxGroup grp;
	
	public EventEx6() {
		Panel p = new Panel();
		grp = new CheckboxGroup();
		p.add(red = new Checkbox("Red", false, grp));
		p.add(green = new Checkbox("Green", false, grp));
		p.add(cyan = new Checkbox("CYAN", true, grp));
		red.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				setBackground(Color.red);
			}
		});
		green.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				setBackground(Color.green);
			}
		});
		cyan.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				setBackground(Color.cyan);
			}
		});
		setBackground(Color.CYAN);
		add(p, BorderLayout.SOUTH);
	}
	
	public static void main(String[] args) {
		new EventEx5();
	}

}
