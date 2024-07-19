package ch04;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class LuckyLotto3 {

	public static void main(String[] args) {
		int arr[] = getLotto();
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
	
	public static int[] getLotto() {
		int lotto[] = new int[6];
		for (int i = 0; i < lotto.length; i++) {
			int num = (int)(Math.random()*45)+1;
			if(isDuplication(lotto, num)) {
				i--;
			}else {
				lotto[i] = num;
			}
		}
		Arrays.sort(lotto);
		return lotto;
	}
	//"12 34 2 45".contains("2") : 중복이면 true
	public static boolean isDuplication(int arr[], int num) {
		String str = "";
		for(int i = 0; i<arr.length; i++) {
			str += arr[i]+" ";
		}//배열값 -> "12 34 2 45"
		return str.contains(String.valueOf(num));
	}
}
