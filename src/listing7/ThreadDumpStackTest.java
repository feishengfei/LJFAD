package listing7;

import java.util.Date;


public class ThreadDumpStackTest implements Runnable
{

	public static void main(String[] args)
	{
		ThreadDumpStackTest tdst = new ThreadDumpStackTest();
		Thread t = new Thread(tdst);
		t.start();
		System.out.println("+++Thread dumpStack+++");
		//t.dumpStack();
		System.out.println("---Thread dumpStack---");
	}

	@Override
	public void run()
	{
		try
		{
			Thread.sleep(1000*10);
		}
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(new Date().toString());
	}

}
