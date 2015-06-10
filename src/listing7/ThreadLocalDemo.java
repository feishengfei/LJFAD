package listing7;

public class ThreadLocalDemo
{
	private static volatile ThreadLocal<String> userID = new ThreadLocal<String>();
	public static void main(String[] args)
	{
		Runnable r = new Runnable()
		{
			@Override
			public void run()
			{
				String name = Thread.currentThread().getName();
				if(name.equals("A"))
					userID.set("foxtrot");
				else
					userID.set("charlie");
				System.out.println(name + " " + userID.get());
			}
		};
		
		Thread a = new Thread(r);
		a.setName("A");
		
		Thread b = new Thread(r);
		b.setName("B");
		
		a.start();
		b.start();
	}

}
