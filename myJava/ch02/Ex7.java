package ch02;

public class Ex7 {
	public static void main(String[] args) 
			throws Exception{
		System.out.println("키보드에서 입력하고 Enter하세요");
		//제어문(반복문) :  while
		while(true) {
			int keyCode = System.in.read(); //키보드에 입력한 문자
			System.out.println("keyCode : " + keyCode);
			if(keyCode==113 /*q*/) {
				break;
			}
			System.out.println("종료");
		}
	}
}