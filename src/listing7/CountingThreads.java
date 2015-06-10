package listing7;

public class CountingThreads
{

	public static void main(String[] args)
	{
		Runnable r = new Runnable()
		{
			
			@Override
			public void run()
			{
				String name = Thread.currentThread().getName();
				int count = 0;
				while(true) {
					System.out.println(name + ": " + count++);
					try
					{
						Thread.sleep(1000);
					}
					catch (InterruptedException e)
					{
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		
		Thread ta = new Thread(r);
		ta.setName("Thread A");
		Thread tb = new Thread(r);
		tb.setName("Thread B");
		
		ta.start();
		tb.start();
	}

}
