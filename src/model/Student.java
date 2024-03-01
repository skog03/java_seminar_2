package model;

public class Student {
	//variables
	private long stID;
	private String name;
	private String surname;
	//setters and getters
	
	private static long counter = 10000;
	
	public long getStID() {
		return stID;
	}
	public void setStID() {
		this.stID = counter;
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
	
	//constructors
	//no-argument constructor, which initializes the default values
	public Student() {
		setStID();
		setName("John");
		setSurname("Doe");
	}
	
	//argument constructor, which initializes variables based on input parameters
	public Student(String name, String surname, degree profdegree) {
		setStID(); 
		setName(name);
		setSurname(surname);
	}

	//toString
	@Override
	public String toString() {
		return stID + ": " + name + " " + surname;
	}
	
	
	//other
	
}
