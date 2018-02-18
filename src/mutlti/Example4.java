package mutlti;

class Mythread3 extends Thread {
	//overriding method of the thread class

	public void run() {
		for(int i= 0 ;i<5 ;i++)
		{
		
		m1();//calling on o arg method
		m2();//calling on o arg method
		m3();//calling on o arg method
		
		}
	}
	
	 void m1() {
		System.out.println("m1 method ");
		
	}
	 void m2() {
		System.out.println("m2 method ");
		
	}
	 void m3() {
		System.out.println("m3 method ");
		
	}
	
	
}
public class Example4 {

	public static void main(String args[])//main thread
	{
		
	     Mythread3 t = new Mythread3();
	     //user define thread 
		 t.start();//2 thread are calling 
		 
	}
}