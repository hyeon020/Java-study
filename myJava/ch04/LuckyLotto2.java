package ch04;

import java.util.Arrays;
import java.util.Random;
import java.util.TreeSet;

public class LuckyLotto2 {

	public static void main(String[] args) {
		Object arr[] = getLotto();
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
	}
	
	//TreeSet(자료구조)는 중복과 정렬이 자동으로 만들어지는 클래스
	public static Object[] getLotto() {
		TreeSet<Integer> tr = new TreeSet<Integer>();
		for(int i=0; tr.size() < 6; i++) {
			int num = (int)(Math.random()*45)+1;
			tr.add(num);
		}
		Object lotto[] = tr.toArray();
		return lotto;
	}
}
