package listing5_1;

public class Date
{
	private int year;
	private int month;
	private int date;
	/**
	* Allocates a <code>Date</code> object and initializes it so that * it represents midnight, local time, at the beginning of the day * specified by the <code>year</code>, <code>month</code>, and
	* <code>date</code> arguments.
	*
	* @param year	the year minus 1900
	* @param month	the monthe between 0~11
	* @param date	the day of the month between 1~31
	* @see java.util.Calendar
	* @deprecated As of JDK version 1.1,
	* replaced by <code>Calendar.set(year + 1900, month, date)</code> 
	* or <code>GregorianCalendar(year + 1900, month, date)</code>.
	*/
	@Deprecated
	public Date(int year, int month, int date) {
		super();
		this.year = year;
		this.month = month;
		this.date = date;
	}
	
}
