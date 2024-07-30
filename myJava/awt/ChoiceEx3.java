package awt;

import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx3 extends MFrame implements ItemListener{
	
	Choice name, star;
	String ms[] = {"�� ��","�� ��","�̹�ȣ","�����","����","������"};
	String fs[] = {"��ƶ�","�̿���","���ϴ�","��ä��","�� ��","�迬��"};
	
	//star�� ������ item �����ϰ� �ٽ� �߰�
	public ChoiceEx3() {
		setTitle("Choice ����3");
		name = new Choice();
		name.add("���ڿ�����");
		name.add("���ڿ�����");
		star = new Choice();
		/*for(int i=0; i<ms.length; i++) {
			star.add(ms[i]);
		}*/
		inputItem(star, ms);
		name.addItemListener(this);
		add(name);
		add(star);
	}
	
	public void inputItem(Choice ch, String item[]) {
		ch.removeAll();
		for(int i=0; i<item.length;i++) {
			ch.add(item[i]);
		}
	}
	
	@Override
	public void itemStateChanged(ItemEvent e) {
		if(name.getSelectedItem().equals("���ڿ�����")) {
			inputItem(star, ms);
		}else if(name.getSelectedItem().equals("���ڿ�����"))
			inputItem(star, fs);
	}
	
	public static void main(String[] args) {
		new ChoiceEx3();
	}

}
