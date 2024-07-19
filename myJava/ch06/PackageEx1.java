package ch06;

//패키명 : 도메인 뒤로. http://mysql.com
import com.mysql.cj.jdbc.Driver;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.util.Date;

public class PackageEx1 {
	public static void main(String[] args) 
			throws Exception {
			Driver d = new Driver();
			Frame f = new Frame();
			Button btn = new Button();
			ActionEvent ae;
			//Data : java.util, java.sql
			//많이 사용하는 클래스는 import
			Date date = new Date(); 
			//적게 사용하는 클래스 full name
			java.sql.Date date1 = new java.sql.Date(0);
	}
}
