package ch04;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자를 입력하세요 : ");
		int a = sc.nextInt();
		// 입력한 숫자가 양수인지 음수인지, 0인지 구분하시오
		if (a > 0)
			System.out.println(a + "는 양수입니다.");
		else if (a < 0)
			System.out.println(a + "는 음수입니다.");
		else if (a == 0)
			System.out.println(a + "는 0입니다.");
	}

}