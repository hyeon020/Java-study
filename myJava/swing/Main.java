package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main extends JFrame{
	public Main() {
		setSize(300, 300);
		setLayout(new FlowLayout());
		JButton btn = new JButton("");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				btn.setBackground(Color.orange);
			}
		});
		btn.setForeground(Color.red);
		JLabel label = new JLabel("¶óº§");
		label.setForeground(Color.green);
		add(btn);
		add(label);
		setVisible(true);
	}

	public static void main(String[] args) {
		new Main();
	}

}