package ch14;

import java.io.InputStream;

public class InputStreamEx1 {

	public static void main(String[] args) {
		
		InputStream is = System.in; //Ű����
		//io�� �޼ҵ�� ��κ� ����ó��
		while(true) {
			try {
				int a = is.read(); //�������� ������ : �Է� ���� ��� ����
				if(a==-1) break;
				System.out.print((char)a);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}//--while
		System.out.println("����");
	}
}
