package ch02;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		//입력된 숫자가 짝수인가 홀수인가?
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		if(a%2==0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");
	}

}
