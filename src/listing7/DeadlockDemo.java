package listing7;

public class DeadlockDemo
{
	private Object lock1 = new Object();
	private Object lock2 = new Object();
	
	public void instanceMethod1()
	{
		synchronized (lock1)
		{
			synchronized (lock2)
			{
				System.out.println("first thread in instanceMethod1");
			}
		}
	}
	
	public void instanceMethod2()
	{
		synchronized (lock2)
		{
			synchronized (lock1)
			{
				System.out.println("second thread in instanceMethod2");
			}
		}
	}

	public static void main(String[] args)
	{
		final DeadlockDemo dld = new DeadlockDemo();
		Runnable r1 = new Runnable()
		{
			@Override
			public void run()
			{
				while(true)
					dld.instanceMethod1();
			}
		};
		
		
		Runnable r2 = new Runnable()
		{
			@Override
			public void run()
			{
				while(true)
					dld.instanceMethod2();
			}
		};
		
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
	}

}
