package ch11;

/*멀티 Thread에서 동기화가 가능한 StringBuffer
 *단일 Thread 동기화가 불가능한 String Builder*/
public class PalindromeEx1 {

	public static final int MAX = 100000;

	public static void main(String[] args) {
		/*
		 * 앞에서부터 읽을 때나 뒤에서부터 읽을 때나 모양이 같은 수를 대칭수(palindrome)라고 합니다. 대칭수(palindrome)인
		 * 585는 2진수로 나타내도 1001001001가 되어 여전히 대칭수입니다.
		 */

		// 문제1.10진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		System.out.println("1번");
		int i=0;
		int sum = 0;
		while(i<= MAX) {
			String s = String.valueOf(i);
			StringBuffer sb = new StringBuffer(s);
			if(s.equals(sb.reverse().toString())) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
		
		// 문제2.2진법의 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		System.out.println("2번");
		i=1;
		sum = 0;
		while(i<= MAX) {
			String s = Integer.toBinaryString(i);
			StringBuilder sb = new StringBuilder(s);
			if(s.equals(sb.reverse().toString())) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
		// 문제3.10진법과 2진법으로 모두 대칭수인 100,000 이하 숫자의 합은 얼마입니까?
		System.out.println("3번");
		i=1;
		sum = 0;
		while(i<= MAX) {
			String s1 = String.valueOf(i);
			String s2 = Integer.toBinaryString(i);
			StringBuilder sb1 = new StringBuilder(s1);
			StringBuilder sb2 = new StringBuilder(s2);
			if(s1.equals(sb1.reverse().toString())&&
					s2.equals(sb2.reverse().toString())) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
		
	}
}




