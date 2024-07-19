package ch06;

import ch06_1.AccessEx4;

public class AcceessEx5 {

	public static void main(String[] args) {
		AccessEx4 ac = new AccessEx4();
		//ac.b = 10; //다른 package 경우에는 protected 접근 불가
		ac.c = 20;
	}

}