package listing7;

public class Producer extends Thread
{
	private Shared s;

	public Producer(Shared s)
	{
		super();
		this.s = s;
	}


	@Override
	public void run()
	{
		for (char ch = 'A'; ch <= 'Z'; ch++)
		{
			synchronized (s)
			{
				s.setSharedChar(ch);
				System.out.println(ch + " produced by producer.");
			}
		}
	}

}
