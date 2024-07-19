package ch03;

public class Ex5 {
    public static void main(String[] args) {
	   //논리연산 : &, &&, |, ||
	   //홍길동은 키도 크고 잘 생겼다.
	   //홈길동 키가 크거나 또는 잘 생겼다.
       int a = 10;
       int b = 4;
       System.out.println((a==b)&(a>b));
       System.out.println((a==b)&&(a>b));
       int c = 0;
       System.out.println((a==b)&&(a/c>b));
       System.out.println((a!=b)|(a<b));
       System.out.println((a!=b)||(a<b));
       //System.out.println((a==b)||(a/c>b)); //앞에가 false이므로 뒤에도 본다. 따라서 오류
       //XOR : 배타적 논리값 <- 서로 값이 다르면 true
       System.out.println("-------------------------------");
       System.out.println((a==b/*f*/)^(a>b/*t*/));
       System.out.println((a!=b)^(a>b));
       System.out.println(true^false); //t
       System.out.println(true^true); //f
       System.out.println(false^false); //f
    }
}
