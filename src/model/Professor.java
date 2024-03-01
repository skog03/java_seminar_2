package model;

public class Professor {
	//variables
	private long pID;
	private String name;
	private String surname;
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
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		if(name != null && name.matches("[A-Z]{1}[a-z]{1,20}")) 
			this.name = name;
		else
			this.name = "Undefined";
	}
	
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		if(name != null && name.matches("[A-Z]{1}[a-z]{1,20}")) 
		this.surname = surname;
	else
		this.name = "Undefined";
	}
	
	public Degree getProfdegree() {
		return profdegree;
	}
	public void setProfdegree(Degree profdegree) {
		if(name != null)
			this.profdegree = profdegree;
		else
			this.profdegree = Degree.other;
	}

	//constructors
	//no-argument constructor, which initializes the default values
	public Professor() {
		setpID();
		setName("John");
		setSurname("Doe");
		setProfdegree(Degree.other);
	}
	
	//argument constructor, which initializes variables based on input parameters
	public Professor(String name, String surname, Degree profdegree) {
		setpID(); 
		setName(name);
		setSurname(surname);
		setProfdegree(profdegree);
	}

	//toString
	@Override
	public String toString() {
		return pID + ": " + name + " " + surname + "(" + profdegree + ")";
	}
	
	
	//other
}
