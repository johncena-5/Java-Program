package pojoClass;

public class Spouse {
	
	String sname;
	long []mob;
	String occupation;

	public Spouse(String sname, long []mob, String occupation) {
		this.sname=sname;
		this.mob=mob;
		this.occupation=occupation;
	}
	public Spouse() {
		
	}
	
	public String getSname() {
		return sname;
	}
	public long[] getMob() {
		return mob;
	}
	public String getOccupation() {
		return occupation;
	}
}
