package ch04;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		//1~20사이의 숫자 중에 3,6,9 해당하는 숫자는 짝으로 표시
		System.out.print("3,6,9 게임 숫자를 입력하세요 : ");
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b = a%10; //10자리를 날림
		if(b==3 || b==6 || b==9) {
			System.out.println("짝");
		}else {
			System.out.println(a);
		}
	}

}
