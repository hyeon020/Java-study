package ch06;

class This5{
	int a; 
	String str;
	
	This5(){
		/*생성자 기본 기능*/
	}
	This5(int a){
		this.a = a;
		/*생성자 기본 기능*/
	}
	This5(String str){
		this.str = str;
		/*생성자 기본 기능*/
	}
	This5(int a, String str){
		this.a = a;
		this.str = str;
		/*생성자 기본 기능*/
	}
}

class This6{
	int a;
	String str;
	
	This6() {
		this(10, "익명");
	}
	This6(String str){
		this(10, str);
	}
	This6(int a){
		//내 객체에 super두개 생성할 필요 없음(밑에 이미 있기 때문)
		//this() 생성자 호출시 super() 호출 불필요.
		this(a, "익명"); //생성자의 첫번째 라인 선언
	}
	This6(int a, String str){
		super();
		this.a = a;
		this.str = str;
		/*생성자 기본 기능*/
	}
}
public class ConstructorEx5 {

}
