package listing3_1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggingApptCalendar extends ApptCalendar {
	Logger log;
	
	public LoggingApptCalendar() {
		log = Logger.getAnonymousLogger();
	}
	
	@Override
	public void addAppt(Appt appt) {
		log.log(Level.INFO, appt.toString());
		super.addAppt(appt);
	}

	@Override
	public void addAppts(Appt[] appts) {
		for (int i = 0; i < appts.length; i++)
			log.log(Level.INFO, appts[i].toString());
		super.addAppts(appts);
	}
	
	public static void main(String[] args) {
		LoggingApptCalendar lapptc = new LoggingApptCalendar();
		lapptc.addAppts(new Appt[]{
			new Appt("Working"),
			new Appt("Eating"),
			new Appt("Resting"),
			});
	}
}
