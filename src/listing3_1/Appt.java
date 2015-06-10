package listing3_1;

public class Appt {
	private String note;
	public String getNote() {
		return note;
	}
	public void setNote(String note) {
		this.note = note;
	}
	@Override
	public String toString() {
		return note;
	}
	
	public Appt(String note) {
		super();
		this.note = note;
	}
}
