package ch11;

import java.util.Iterator;

public class StringEx2 {

	public static void main(String[] args) {
		String str = "Java Programming";
		//str += "!!!";
		System.out.println(str);
		int len = str.length();
		System.out.println("len : "+len);
		System.out.println(str.toLowerCase());
		System.out.println(str.toUpperCase());
		
		String str2 = str.substring(5);
		String str3 = str.substring(5, 10);
		System.out.println(str2);
		System.out.println(str3);
		
		//8번째 문자
		char c1 = str.charAt(8);
		System.out.println(c1);
		//짝수만 출력하시오.
		for(int i=0; i<len; i++) {
			if(i%2==0)
				System.out.println(str.charAt(i));
		}//--for
		System.out.println();
		//첫번째 a문자는 위치값은?
		int idx1 = str.indexOf('a'); //처음검색
		System.out.println(idx1);
		int idx2 = str.lastIndexOf('a'); //뒤에서 부터 검색
		System.out.println(idx2);
		int idx3 = str.indexOf('z');
		System.out.println(idx3);
		//a를 'q' 로 변환 출력하시오
		for(int i=0; i<len; i++) {
			if(str.charAt(i)=='a') {
				System.out.println('q');
			}else {
				System.out.println(str.charAt(i));
			}
		}//--if-else
		System.out.println();
		String str4 = str.replace('a', 'q');
		System.out.println(str4);
		//str 반대로 출력
		for(int i=len-1; i>=0; i--) {
			System.out.println(str.charAt(i));
		}
		System.out.println();
		StringBuffer sb = new StringBuffer(str);
		System.out.println(sb.reverse());
		
		String str5= "Java&JSP&Flutter&Iot&Spring";
		String str6[] = str.split("&");
		for (int i = 0; i < str6.length; i++) {
			System.out.println(str6[i]);
		}
		String str7 = "		JSPStudy		";
		System.out.println("***"+str7.trim()+"***");
		int idx4 = 35;
		//정수 -> 문자열 
		String str8 = String.valueOf(idx4);
		String stt9 = idx4+"";
	}

}
