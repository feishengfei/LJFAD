package listing7;

public class StoppableThread extends Thread
{
	private boolean stopped = false;
	
	@Override
	public void run()
	{
		while(!stopped)
			System.out.println("running");
	}
	
	public void stopThread()
	{
		stopped = true;
	}

	public static void main(String[] args)
	{
		StoppableThread t = new StoppableThread();
		t.start();
		try
		{
			Thread.sleep(1000); //sleep for 1 second
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		
		t.stopThread();

	}

}
