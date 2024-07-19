package ch04;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		/*Month(1~12)입력을 하면 각각
		 * 봄 : 3~5
		 * 여름 : 6~8
		 * 가을 : 9~11
		 * 겨울 : 12~2
		 * 5 입력하면 봄입니다.
		 * 만약 범위가 벗어나면 '해당되는 계절이 없습니다.'*/
		Scanner sc = new Scanner(System.in);
		System.out.print("Month(1~12)를 입력하세요 : ");
		int month = sc.nextInt();
		//if-else
		if(month >=3 && month <=5) {
			System.out.println("봄입니다.");
		}else if(month >=6 && month <=8) {
			System.out.println("여름입니다.");
		}else if(month >=9 && month <=11) {
			System.out.println("가을입니다.");
		}else if(month == 12 || month >=1 && month <=2) {
			System.out.println("겨울입니다.");
		}else {
			System.out.println("해당되는 계절이 없습니다.");
		}
		//switch
		System.out.println("----------------");
		switch(month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다.");
			break;
		
		case 6:
		case 7:
		case 8:
			System.out.println("여름입니다.");
			break;
			
		case 9:
		case 10:
		case 11:
			System.out.println("가을입니다.");
			break;
			
		case 12:
		case 1:
		case 2:
			System.out.println("겨울입니다.");
			break;
			
		default:
			System.out.println("해당되는 계절이 없습니다.");

		}
	}

}
