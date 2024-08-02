package member;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.List;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ZipcodeFrame extends MFrame implements ActionListener{

	JLabel label;
	JButton searchBtn, selectBtn;
	List list;
	TextField tf;
	JPanel p1,p2;
	MemberMgr mgr;
	DialogBox err;
	MemberAWT awt;
	
	public ZipcodeFrame(MemberAWT awt) {
		super(300,500);
		setTitle("ZipcodeFrame");
		this.awt = awt;
		mgr = new MemberMgr();
		p1=new JPanel();
		p1.setBackground(Color.LIGHT_GRAY);
		p1.add(label = new JLabel ("���θ� : ",label.CENTER));
		p1.add(tf = new TextField("�����",15));
		p1.add(searchBtn = new JButton("�˻�"));
		tf.addActionListener(this);
		searchBtn.addActionListener(this);
		//////////////////////////////////////
		list = new List();
		list.addActionListener(this);
		//////////////////////////////////////
		p2=new JPanel();
		p2.add(selectBtn = new JButton("����"));
		selectBtn.addActionListener(this);
		p2.setBackground(Color.LIGHT_GRAY);
		add(p1,BorderLayout.NORTH);
		add(list,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		tf.requestFocus();
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		if(obj==tf||obj==searchBtn) {
			if(list.getItemCount()!=0) ///�˻� ����� �ִٸ�
				list.removeAll();
			Vector<ZipcodeBean> vlist = mgr.zipcodeSearch(tf.getText().trim());
			//System.out.println(vlist.size());
			if(vlist.isEmpty()) {
				if(err==null) {
					err = new DialogBox(this, "�˻� ����� �����ϴ�", "�˸�");
			}else {
				    err.setLocationRelativeTo(this);
					err.setVisible(true);
				}
		}else {
			for(int i=0; i<vlist.size(); i++) {
				ZipcodeBean bean = vlist.get(i);
				String adds = bean.getZipcode();
				adds += bean.getArea1().trim()+" ";
				adds += bean.getArea2().trim()+" ";
				adds += bean.getArea3().trim()+" ";
				list.add(adds);
			}
		}
	}else if(obj==list||obj==selectBtn) {
		/*������ �ּҸ� ����Ŭ�� �Ǵ� '����'�� Ŭ���ϸ� 
		 * ZipcodeFrame ������� MemberAWTâ�� �ּҰ� ����.
		 * �˻��� �ּҴ� ��� ����*/
		String add = list.getSelectedItem();
		awt.tf4.setText(add);
		list.removeAll();
		dispose();
		}
	}
	
	public static void main(String[] args) {
		//new ZipcodeFrame();
	}
}