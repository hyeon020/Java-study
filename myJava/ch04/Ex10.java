package ch04;

public class Ex10 {

	public static void main(String[] args) {
		//break, continue
		int a = 0;
		while(true) {
			if(a==10) break;
			//System.out.println("a : " + a);
			a++;
		}
		
		/*for문을 이용하여 순차적으로 1에서 n까지의 
		합이 100에서 최대한 가까운 합을 리턴*/
		int sum = 0;
		for(int i=1; true; i++) {
			if(sum >100) break;
			sum += i;
		}
		System.out.println(sum);
		
		/*for문을 이용하여 순차적으로 1에서 n까지의 
		합이 100이하에 가장 가까운 n과 sum 값 리턴
		n : **
		sum : **
		*/
		int sum1 = 0;
		int n = 0;
		for(int i=1; true; i++) {
			sum += i;
			if(sum>100) {
				sum -= i;
				n = i-1;
				break;
			}
		} //--for
		System.out.println("n : " + n);
		System.out.println("sum : " + sum);
		System.out.println("-----------------");
		
		/*1~10사이의 짝수를 출력하시오.*/
		for(int i = 1; i< 11; i++) {
			if(i%2 == 0)
				System.out.print(i + "\t");
		}//--for
		/*1~10사이의 짝수를 출력하시오(continue 사용)*/
		for(int i = 1; i< 11; i++) {
			if(i%2!=0)
				continue; //호출 시점에서 i++감
			System.out.print(i + "\t");
		}
		System.out.println();
		
		/*1~20사이에 3의 배수와 식과 합을 출력하시오.(continue)
		3 + 6 + 9 + 12 + 15 + 18 = OOO */
		sum = 0;
		for(int i= 1; i<21; i++) {
			if(i%3 != 0)
				continue;
			sum += i;
			if(i!=18) {
				System.out.print(i + " + ");
			}else System.out.print(i);
		}// --for
		System.out.println(" = " + sum);
	}

}
