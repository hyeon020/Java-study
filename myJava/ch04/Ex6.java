package ch04;

import java.util.Scanner;

public class Ex6 {
	/*점수와 학년을 입력을 받아서 60이상이면 합격인데, 
	 * 4학년은 70점 이상 합격이다.*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("학년을 입력하세요 : ");
		int grade = sc.nextInt();
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		//중첩 if문 사용하여 구현하라.
		if(grade == 4) {
			if(score >= 70 && score <= 100) {
				System.out.println("합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			}
		}else if(grade==1 ||grade==2 || grade==3){
			if(score >= 60 && score <= 100) {
				System.out.println("합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			}
		}
	}

}
