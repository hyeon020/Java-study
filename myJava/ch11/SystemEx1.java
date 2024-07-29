package ch11;

public class SystemEx1 {

	public static void main(String[] args) {
		System.out.println("출력");
		//1초를 1000으로 나누어서 계산 (1/1000): 1970년 1월1일 0시부터 현재까지  
		long time = System.currentTimeMillis();
		System.out.println(time);
		System.exit(0);//자바 프로그램 종료, 0은 정상적인 종료
	}
}
