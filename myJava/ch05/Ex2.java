package ch05;

import java.util.Iterator;

public class Ex2 {

	public static void main(String[] args) {
		//다차원 배열 : n*for
		int arr[][] = new int[2][3];
		for(int i = 0; i<arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + j;
				System.out.println("arr[" + i +"]["+j+"] : " +arr[i][j]);
			}//--for2
		}//--for1
		
		System.out.println("------------------");
		//문제1.arr2의 모든 요소의 합을 구하시오.
		int arr2[][] = {{1,2},
				              {3,4,5},
				              {6},
				              {7,8}, 
				              {9,10}};
		for(int i = 0; i<arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + j;
				System.out.println("arr[" + i +"]["+j+"] : " +arr[i][j]);
			}//--for2
		}//--for1
		System.out.println("------------------");
		
		//문제2. arr3의 평균을 구하시오.
		double arr3[][] = {{1.0},
			       {2.3,3.4},
			       {4.5,6.2,4.3},
			       {9.0}};
		for(int i = 0; i<arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i + j;
				System.out.println("arr[" + i +"]["+j+"] : " +arr[i][j]);
			}//--for2
		}//--for1
		System.out.println("------------------");
				
		//문제3. arr4의 평균과 합을 각각 구하시오.
		int arr4[][][] = { { {1, 2, 3}, {4, 5}, {6, 7, 8, 9}},
				                     { {10, 11}, {12, 13, 14}, {15}, {22}},
				                     { {16, 17, 18, 19, 20},{22, 23, 24}}
									};		
		for(int i = 0; i<arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				for(int k = 0; k<arr[i].length; k++) {
					arr[i][j] = i + j;
					System.out.println("arr[" + i +"]["+j+"] : " +arr[i][j]);
				}
			}//--for2
		}//--for1
		System.out.println("------------------");
	}

}
