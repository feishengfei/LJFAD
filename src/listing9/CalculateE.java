package listing9;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CalculateE
{
	final static int LASTITER = 17;
	public static void main(String[] args)
	{
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Callable<BigDecimal> callable;
		callable = new Callable<BigDecimal>()
		{
			@Override
			public BigDecimal call() throws Exception
			{
				MathContext mc = new MathContext(100, RoundingMode.HALF_UP);
				BigDecimal result = BigDecimal.ZERO;
				for(int i = 0; i <= LASTITER; i++)
				{
					BigDecimal factorial = factorial(new BigDecimal(i));
					BigDecimal res = BigDecimal.ONE.divide(factorial, mc);
					result = result.add(res);
				}
				return result;
			}

			public BigDecimal factorial(BigDecimal n)
			{
				if(n.equals(BigDecimal.ZERO))
					return BigDecimal.ONE;
				else 
					return n.multiply(factorial(n.subtract(BigDecimal.ONE)));
			}
		};
		
		Future<BigDecimal> taskFuture = executor.submit(callable);
		while(!taskFuture.isDone())
			System.out.println("waiting");
		try
		{
			System.out.println(taskFuture.get());
		}
		catch (InterruptedException e)
		{
			System.err.println("interrupted while waiting");
		}
		catch (ExecutionException e)
		{
			System.err.println("task threw an exception");
			System.err.println(e);
		}
		executor.shutdown();
	}

}
