package awt;

import java.awt.Choice;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ChoiceEx3 extends MFrame implements ItemListener{
	
	Choice name, star;
	String ms[] = {"현 빈","원 빈","이민호","김수현","김우빈","이종석"};
	String fs[] = {"고아라","이연희","이하늬","문채원","수 지","김연아"};
	
	//star에 기존에 item 제거하고 다시 추가
	public ChoiceEx3() {
		setTitle("Choice 예제3");
		name = new Choice();
		name.add("남자연예인");
		name.add("여자연예인");
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
		if(name.getSelectedItem().equals("남자연예인")) {
			inputItem(star, ms);
		}else if(name.getSelectedItem().equals("여자연예인"))
			inputItem(star, fs);
	}
	
	public static void main(String[] args) {
		new ChoiceEx3();
	}

}
