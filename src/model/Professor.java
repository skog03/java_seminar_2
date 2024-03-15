package model;

public class Professor extends Person{
	//variables
	private long pID;
	private Degree profdegree;
	//setters and getters
	
	private static long counter = 0;
	
	public long getpID() {
		return pID;
	}
	public void setpID() {
		this.pID = counter;
		counter++;
	}
	
	public Degree getProfdegree() {
		return profdegree;
	}
	public void setProfdegree(Degree profdegree) {
		if(super.getName() != null)
			this.profdegree = profdegree;
		else
			this.profdegree = Degree.other;
	}

	//constructors
	//no-argument constructor, which initializes the default values
	public Professor() {
		super();
		setpID();
		setProfdegree(Degree.other);
	}
	
	//argument constructor, which initializes variables based on input parameters
	public Professor(String name, String surname, String personCode, Degree profdegree) {
		super(name, surname, personCode);
		setpID();
		setProfdegree(profdegree);
	}

	//toString
	@Override
	public String toString() {
		return pID + ": " + super.toString() + " (" + profdegree + ")";
	}
	
	
	//other
	
	
}
