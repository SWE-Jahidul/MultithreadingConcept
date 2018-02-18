package mutlti;


         class Mythread5 extends Thread {
	public void run() {
	    
		System.out.println("hii jahid");
		
	}
         }
	
	class Mythread51 extends Thread {
		public void run() {
		    
			System.out.println("hii jahid");
			
		}
	}
		class Mythread52 extends Thread {
			public void run() {
			    
				System.out.println("hii jahid");
				
			}
}
		
public class Example6 {

	public static void main(String args[])//main thread
	{
		 Mythread5 t1 = new Mythread5();
	      t1.start();
	      Mythread51 t2 = new Mythread51();
	      t2.start();
	      Mythread52 t3 = new Mythread52();
	      t3.start();
	   
	}
}