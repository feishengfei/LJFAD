package listing3_1;

public class ApptCalendar {
	private final static int MAX_APPT = 1000;
	private Appt[] appts;
	private int size;
	
	public ApptCalendar() {
		appts = new Appt[MAX_APPT];
		size = 0;
	}
	
	public void addAppt(Appt appt) {
		if (size == appts.length) 
			return ;
		appts[size++] = appt;
	}
	
	public void addAppts(Appt[] appts) {
		for (int i = 0; i < appts.length; i++)
			addAppt(appts[i]);
	}
}
