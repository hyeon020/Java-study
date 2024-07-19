package ch04;

public class GuGuDan {

	public static void main(String[] args) {
		System.out.println("구구단");
		for(int i=1; i<10; i++) {
			System.out.println(i + "단");
			for(int j=2; j<10; j++) {
				System.out.print(j + "*"+i+"="+(i*j));
				System.out.print("\t");
			}
			System.out.print("  ");
		}
	}

}
