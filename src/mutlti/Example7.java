package mutlti;


class Multithreading extends Thread
{
	
 public	void run()
	{
		
	}
}

public class Example7 {
	
	public static void main (String args[])
	{
		
		Multithreading m1 =new Multithreading();
		m1.start();
		System.out.println(m1.getName());
		Multithreading m2 =new Multithreading();
		m2.start();
		System.out.println(m2.getName());
		m1.setName("rahaman");
		System.out.println(m1.getName());
		System.out.println(Thread.currentThread().getName());
		Thread.currentThread().setName("jahid");
		System.out.println(Thread.currentThread().getName());
		System.out.println(m1.getId());
		System.out.println(m2.getId());
		System.out.println(m1.isAlive());
		System.out.print(Thread.activeCount());
		
	}

}
