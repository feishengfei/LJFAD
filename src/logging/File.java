package logging;

public class File implements Logger
{
	private String dstName;
	
	public File(String dstName) {
		super();
		this.dstName = dstName;
	}

	@Override
	public boolean connect()
	{
		if(dstName == null)
			return false;
		System.out.println("opening file " + dstName);
		return true;
	}

	@Override
	public boolean disconnect()
	{
		if(dstName == null)
			return false;
		System.out.println("closing file " + dstName);
		return false;
	}

	@Override
	public boolean log(String msg)
	{
		if(dstName == null)
			return false;
		System.out.println("writing " + msg + " to file " + dstName);
		return true;
	}

}
