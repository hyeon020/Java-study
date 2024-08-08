package ch14;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class BufferedWriterEx1 {

	public static void main(String[] args) {
		String str = "ø¿¥√¿∫ ¡Ò∞≈øÓ »≠ø‰¿œ";
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		try {
			bw.write(str, 0, str.length());
			bw.newLine();
			bw.write(str);
			bw.flush();
			bw.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
