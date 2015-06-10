package listing3_1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingApptCalendar{
	Logger log;
	private ApptCalendar apptCal;
	
	public LoggingApptCalendar(ApptCalendar apptCal) {
		log = Logger.getAnonymousLogger();
		this.apptCal = apptCal;
	}
	
	public void addAppt(Appt appt) {
		log.log(Level.INFO, appt.toString());
		apptCal.addAppt(appt);
	}

	public void addAppts(Appt[] appts) {
		for (int i = 0; i < appts.length; i++)
			log.log(Level.INFO, appts[i].toString());
		apptCal.addAppts(appts);
	}
	
	public static void main(String[] args) {
		LoggingApptCalendar lapptc = new LoggingApptCalendar(new ApptCalendar());
		lapptc.addAppts(new Appt[]{
			new Appt("Working"),
			new Appt("Eating"),
			new Appt("Resting"),
			});
	}
}
