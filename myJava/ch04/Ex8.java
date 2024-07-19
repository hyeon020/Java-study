package ch04;

public class Ex8 {

	public static void main(String[] args) {
		/*문제1.for문을 이용해서 1~10까지의 합을 구하시오.(식과 함께)
		 * 1 + 2 +.... + 10 = 55*/
		int sum = 0;
		for(int i=1; i<11; i++) {
			if(i !=10) {
				sum += i;
				System.out.print(i + " + ");
			}else if(i==10) {
				System.out.print(i);
			}
		}
		System.out.println(" = " +sum);
		
		//문제2. 1~30사이의 값중에 3의 배수의 합을 구하시오.
		int sum1 = 0;
		for(int j=0; j<31; j += 3) {
			sum1 += j;
		}
		System.out.println(sum1);
		
		//문제3. 1~30사이의 값중에 짝수와 홀수의 합을 각각 구하시오.
		int sum2 = 0, sum3 = 0;
		for(int k=0; k<31; k +=2) {
			sum2 += k;
		}
		System.out.println("짝수의 합은" +sum2);
		for(int l=1; l<31; l +=2) {
			sum3 += l;
		}
		System.out.println("홀수의 합은" +sum3);
		
		/*
		* 문제4. 1~50사이의 3,6,9 게임의 합은? 
		* Hint : %와 /를 사용. 33/10 => 3 
		* sum : 627
		*/
		int sum4 = 0;
		for(int h=1; h<51; h++) {
			if(h%10==3 || h%10==6 || h%10==9 || h/10 ==3) {
				sum4 += h;
			}
		}
		System.out.println(sum4);
	}

}
