package listing7;

public class Shared
{
	private char c = '\u0000';
	private boolean writeable = true;
	
	synchronized void setSharedChar(char c)
	{
		while(!writeable) {
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		this.c = c;
		writeable = false;
		notify();
	}
	
	synchronized char getSharedChar()
	{
		while(writeable) {
			try
			{
				wait();
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		writeable = true;
		notify();
		return c;
	}
}
