package listing7;

public class ThreadThrowArithmeticExceptionTest
{

	public static void main(String[] args)
	{
		Runnable r = new Runnable()
		{
			@Override
			public void run()
			{
				int x = 1/0;
			}
		};
		Thread t = new Thread(r);
		
		Thread.UncaughtExceptionHandler uceh;
		
		//install uncaughtExceptionHandler
		uceh = new Thread.UncaughtExceptionHandler()
		{
			
			@Override
			public void uncaughtException(Thread t, Throwable e)
			{
				System.out.println("Caught throwable " + e 
						+ " for thread" + t);
			}
		};
		t.setUncaughtExceptionHandler(uceh);
		
		//install defaultUncaughtExceptionHandler
		uceh = new Thread.UncaughtExceptionHandler()
		{
			
			@Override
			public void uncaughtException(Thread t, Throwable e)
			{
				System.out.println("Default uncaught exception handler");
				System.out.println("Caught throwable " + e 
						+ " for thread " + t);
			}
		};
		t.setDefaultUncaughtExceptionHandler(uceh);
		
		
		//thread start
		t.start();
	}

}
