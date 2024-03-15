package model;

public class Student extends Person {
	//variables
	private long stID;

	//setters and getters
	
	private static long counter = 1000;
	
	public long getStID() {
		return stID;
	}
	public void setStID() {
		this.stID = counter;
		counter++;
	}
	//constructors
	//no-argument constructor, which initializes the default values
	public Student() {
		super(); //Person constructor will be called
		setStID();
	}
	
	//argument constructor, which initializes variables based on input parameters
	public Student(String name, String surname, String personCode) {
		super(name, surname, personCode); //Person constructor will be called
		setStID(); 
	}

	//toString
	@Override
	public String toString() {
		return stID + ": " + super.toString();
	}
	
	
	//other
	
}
