package listing7;

public class Consumer extends Thread
{
	private Shared s;

	public Consumer(Shared s)
	{
		super();
		this.s = s;
	}

	@Override
	public void run()
	{
		char ch;
		do {
			synchronized (s)
			{
				ch = s.getSharedChar();
				System.out.println(ch + " consumed by consumer.");
			}
		}while(ch != 'Z');
	}
	
}
