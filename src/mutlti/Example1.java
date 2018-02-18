package mutlti;

class MyThred extends Thread{
	
	public void run()
	{
		for(int i=0;i<=10 ;i++)
		{
			System.out.println("user define thread");
		}
	}
}
	
	
	public class Example1 {
		
		
	public static void main(String args[])
	{
		
		MyThred t = new MyThred();		
		t.start();
		for(int i=0;i<=10;i++)
		{
			System.out.println("main thread");
		}
	
		
	}
}
