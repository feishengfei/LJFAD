package listing7;


public class CheckingAccount
{
	private int balance;
	public CheckingAccount(int initialBalance)
	{
		balance = initialBalance;
	}
	
	public boolean withdraw(int amount)
	{
		if (amount <= balance)
		{
			try
			{
				Thread.sleep((int)(Math.random()*200));
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
			balance -= amount;
			return true;
		}
		return false;
	}
	
	public static void main(String[] args)
	{
		final CheckingAccount ca = new CheckingAccount(100);
		Runnable r = new Runnable() {

			@Override
			public void run()
			{
				String name = Thread.currentThread().getName();
				for (int i = 0; i < 10;i++) {
					System.out.println(name + " withdraws $10: "
							+ ca.withdraw(10));
				}
			}
			
		};
		Thread tHusband = new Thread(r);
		tHusband.setName("Husband");
		Thread tWife = new Thread(r);
		tWife.setName("Wife");
		
		tHusband.start();
		tWife.start();
		
	}

}
