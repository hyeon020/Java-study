package ch03;

import java.util.Arrays;
import java.util.Iterator;

public class Ex8 {

	public static void main(String[] args) {
		//배열(아파트) : 동일한 data type을 하나의 변수로 묶어 놓은 문법적인 기능
		int a = 10;
		int b = 20;
		int c = 30;
		int sum = a + b + c;
		String str = new String();
		System.out.println(sum);
		//1. 배열선언
		int arr[];
		//2. 배열 크기 지정(선언)
		arr = new int[3];
		//3. 배열 값 할당
		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;
		System.out.println(arr[0]+arr[1]+arr[2]);
		//배열에 값을 할당하거나 값을 가져올때는 반드시 for문
		int arr1[] = new int[5];
		//배열은 내부적으로 Arrays 객체가 만들어 지고 length는 배열의 길이의 변수
		//1->2->4->3->2->4->3....
		int sum1 = 0;
		for (int i = 0/*1*/; i < arr1.length/*2*/; i++/*3*/) {
			/*4*/
			arr1[i] = i*10;
			sum1 += arr1[i];
		}
		System.out.println(sum1);
	}

}
