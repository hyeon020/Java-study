package ch03;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		int a =10;
		int b = 3;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int c = sc.nextInt(); // 입력한 숫자를 리턴
		if(c%2==0)
			System.out.println(c + " 짝수입니다");
		else
			System.out.println(c + " 홀수입니다");
	}
}