package mutlti;
class Mythread1 extends Thread {
	//overriding method of the thread class
	public void run() {
		for(int i = 0 ; i<=10; i++)
		{
			System.out.println(i +"   userdefiend thread");
		}
	}
	
}

public class Example2 {

	public static void main(String args[])//main thread
	{
		
	     Mythread1 t = new Mythread1();//user define thread 
		t.run();//2 thread are calling 
		for(int i=0 ;i<=10 ;i++)//logic of the thread
		{
			System.out.println(i +"   Main thread");
		}
		
	}
}
