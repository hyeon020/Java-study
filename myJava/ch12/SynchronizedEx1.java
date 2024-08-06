package ch12;

public class SynchronizedEx1 implements Runnable{

	public SynchronizedEx1(){
		
	}
	
	public void a(String who){
		try {
			Thread.sleep(200);
		} catch (Exception e) {}
		System.out.println(who + " : b() 호출");
		b(who);
	}
	
	public void b(String who){
		try {
			Thread.sleep(200);
		} catch (Exception e) {}
		System.out.println(who + " : a() 호출");
		a(who);
	}
	
	@Override
	public void run() {
		b(Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		SynchronizedEx1 s1 = new SynchronizedEx1();
		Thread t1 = new Thread(s1,"첫번째");
		Thread t2 = new Thread(s1,"두번째");
		t1.start();
		t2.start();
	}
}