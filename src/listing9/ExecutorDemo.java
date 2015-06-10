package listing9;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class ExecutorDemo
{

	public static void main(String[] args)
	{
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Future<String[]> taskFuture = executor.submit(new Callable<String[]>()
		{

			@Override
			public String[] call() throws Exception
			{
				for(int i=10; i>0; i--){
					Thread.sleep(1000);
					System.out.println("Counting down " + i);
				}
				
				return new String[]{"hello", "world"};
			}
		});
		
		String[] entries = null;
		while(null == entries) {
			try
			{
				entries = taskFuture.get(1, TimeUnit.SECONDS);
			}
			catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (ExecutionException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (TimeoutException e)
			{
				System.err.println("not finished yet!!!");
			}
		}
		for(String s:entries)
			System.out.println("s:"+s);
	}

}
