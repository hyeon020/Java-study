package ch06;

//부모클래스
class Person {
	String name;
	int age;
	
	//this : 자신의 객체를 가르치는 키워드. 
	//내 자신의 객체 속성의 필드 호출시 this.사용
	Person(String name, int age) {
		super();//Object 객체를 생성. 항상 생략되어 있다.
		this.name = name;
		this.age = age;
	}
	
	//Person 클래스의 정보를 출력하는 메소드
	void displayInfo() {
		System.out.println("Name : " + name);
		System.out.println("Age : " + age);
	}
}

//자식클래스 
class Employee extends Person{
	String department;
	
	Employee(String name, int age, String department) {
		super(name, age);
		this.department = department;
	}
	
	@Override
	void displayInfo() {
		super.displayInfo(); //부모의 displayInfo 호출
		System.out.println("Department : " + department);
	}
}

public class ConstructorEx4 {

	public static void main(String[] args) {
		Employee emp = new Employee("홍길동", 28, "개발자");
		emp.displayInfo();
	}

}
