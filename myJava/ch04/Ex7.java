package ch04;

public class Ex7 {

	public static void main(String[] args) {
		//for문을 이용해서 1~10까지 합을 구하시오.
		int sum = 0;
		for(int i=1, j=1; i<11; i++, j--) {
			sum += i;
		}
		System.out.println(sum);
		int j = 0;
		for(;j<11; j++) {
			System.out.println("j : " + j);
		}
		for(;;) {
			System.out.println("무한반복");
		}
		// int a = 10; ->데드코드, 위에가 무한반복이므로
	}

}
