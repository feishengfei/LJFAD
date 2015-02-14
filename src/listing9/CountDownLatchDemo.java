package listing9;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchDemo
{

	final static int NTHREADS = 3;
	
	public static void main(String[] args)
	{
		final CountDownLatch enterLatch = new CountDownLatch(NTHREADS);
		Runnable r = new Runnable()
		{
			
			@Override
			public void run()
			{
				try
				{
					report("entered run()");
					enterLatch.countDown();
					enterLatch.await();
				}
				catch (InterruptedException ie)
				{
					System.err.println(ie);
				}
				report("doing work");
			}

			private void report(String s)
			{
				System.out.println(System.currentTimeMillis() + ": " +
						Thread.currentThread() + ": " + s);
			}
		};
		
		ExecutorService executor = Executors.newFixedThreadPool(NTHREADS);
		for(int i = 0; i < NTHREADS; i++)
			executor.execute(r);
		try
		{
			Thread.sleep(3000);
		}
		catch (InterruptedException ie)
		{
			System.err.println(ie);
		}
		executor.shutdownNow();

	}

}
