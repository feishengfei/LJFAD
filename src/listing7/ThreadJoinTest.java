package listing7;

public class ThreadJoinTest
{

	public static void main(String[] args)
	{
		Runnable r = new Runnable()
		{
			
			@Override
			public void run()
			{
				System.out.println("Worker thread is simulating " +
					"work by sleeping for 10 seconds");
				try
				{
					Thread.sleep(10000);
				}
				catch (InterruptedException ie)
				{
					ie.printStackTrace();
				}
				System.out.println("Worker thread is dying");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		
		System.out.println("Default main thread is doing work.");
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException ie)
		{
			ie.printStackTrace();
		}
		System.out.println("Default main thread has finished its work.");
		System.out.println("Default main thread is waiting for worker thread " + 
				"to die.");
		try
		{
			t.join();
		}
		catch (InterruptedException ie)
		{
			ie.printStackTrace();
		}
		System.out.println("Main thread is dying");
	}

}
