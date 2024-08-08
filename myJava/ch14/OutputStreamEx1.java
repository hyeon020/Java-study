package ch14;

import java.io.OutputStream;

public class OutputStreamEx1 {

	public static void main(String[] args) {
		int a = 'A';
		char b = 'b';
		char c = '정';
		try {
			OutputStream os = System.out; //콘솔창에 출력스트림을 빨대로 꼽았다.
			os.write(a);
			os.write(b);
			os.write(c);
			os.flush(); //스트림에 남아있는 data를 비운다.
			os.close(); // 사용하지 않은 스트림은 반드시 닫는다.
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
