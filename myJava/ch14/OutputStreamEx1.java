package ch14;

import java.io.OutputStream;

public class OutputStreamEx1 {

	public static void main(String[] args) {
		int a = 'A';
		char b = 'b';
		char c = '��';
		try {
			OutputStream os = System.out; //�ܼ�â�� ��½�Ʈ���� ����� �žҴ�.
			os.write(a);
			os.write(b);
			os.write(c);
			os.flush(); //��Ʈ���� �����ִ� data�� ����.
			os.close(); // ������� ���� ��Ʈ���� �ݵ�� �ݴ´�.
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
