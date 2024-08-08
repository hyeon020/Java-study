package ch14;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class WriteEx1 {

	public static void main(String[] args) {
		int a = 'A';
		char b = 'b';
		char c = '��';
		try {
			OutputStream os = System.out;
			Writer writer = new OutputStreamWriter(os);
			writer.write(a);
			writer.write(b);
			writer.write(c);
			writer.flush();
			os.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
