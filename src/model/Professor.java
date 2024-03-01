package model;

public class Professor {
	//variables
	private long pID;
	private String name;
	private String surname;
	private degree profdegree;
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
	
	public degree getProfdegree() {
		return profdegree;
	}
	public void setProfdegree(degree profdegree) {
		if(name != null)
			this.profdegree = profdegree;
		else
			this.profdegree = degree.other;
	}

	//constructors
	//no-argument constructor, which initializes the default values
	//public void ProfConst 
	
	//no argument constructor, which initializes variables based on input parameters
	
	//toString
	//other
}
