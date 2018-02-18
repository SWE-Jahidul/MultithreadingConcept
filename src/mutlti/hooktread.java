package mutlti;



class Mythread6 extends Thread {
	
	public void run()
	{
		System.out.println("my hook thread");
	}
}

public class hooktread {
	
	public static void main(String args[]) {
		double i;
		Mythread6 m6 = new Mythread6();
		Runtime r = Runtime.getRuntime();// 
		r.addShutdownHook(m6);
		for(i=0;i<=10;i++)
		{
		{
			System.out.println("main");
		}
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.err.println(e);
		}
		if(i==5)
		{
			System.exit(0);
		}
		}
	}

}