package mutlti;

class Mythread2 extends Thread {
	//overriding method of the thread class
	public void run() {
		
		for(int i = 0 ; i<=10; i++)
		
		{
			System.out.println(i +"   o agr method");
		}
		
		run(10);//calling on o arg method
		
	}
	
	public void run(int a) {
		
		for(int i = 0 ; i<=10; i++)
		
		{
			System.out.println(i +"  1-arg method");
		}
	}
}

public class Example3 {

	public static void main(String args[])//main thread
	{
		
	     Mythread2 t = new Mythread2();//user define thread 
		 t.start();//2 thread are calling 
		 for(int i=0 ;i<=10 ;i++)//logic of the thread
		
		 {
			System.out.println(i +"   Main thread");
		 }
		
	}
}
