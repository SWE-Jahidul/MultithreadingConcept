package mutlti;

class Mythread4 extends Thread {
	//overriding method of the thread class

	public void run() {
	    
		System.out.println("hii jahid");
		
	}
	
}
public class Example5 {

	public static void main(String args[])//main thread
	{
		
	     Mythread4 t = new Mythread4();
	    t.start();
	    Mythread4 t1 = new Mythread4();
	    t1.start();
	    Mythread4 t2 = new Mythread4();
	    t2.start();
		 
	}
}