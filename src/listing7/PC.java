package listing7;

public class PC
{

	public static void main(String[] args)
	{
		Shared s = new Shared();
		new Producer(s).start();
		new Consumer(s).start();
	}

}
