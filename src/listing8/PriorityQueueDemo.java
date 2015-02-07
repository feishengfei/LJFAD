package listing8;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo
{
	final static int NELEM = 15;
	
	public static void main(String[] args)
	{
		Comparator<Integer> cmp;
		cmp = new Comparator<Integer>()
		{

			@Override
			public int compare(Integer o1, Integer o2)
			{
				return o2 - o1;
			}
		};
		Queue<Integer> qi = new PriorityQueue<Integer>(NELEM, cmp);
		for (int i = 0; i < NELEM; i++)
			qi.add((int) (Math.random()*100));
		while(!qi.isEmpty())
			System.out.print(qi.poll() + " ");
		System.out.println();
	}

}
