package model;

public class Student {
	//variables
	private long stID;
	private String name;
	private String surname;
	private String personCode;
	//setters and getters
	
	private static long counter = 1000;
	
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
	
	public String getPersonCode() {
		return personCode;
	}
	public void setPersonCode(String personCode) {
		if(personCode != null && personCode.matches("[0-9]{6}-[0-9]{5}"))
			this.personCode = personCode;
		else
			this.personCode = "Undefined";
	}
	//constructors
	//no-argument constructor, which initializes the default values
	public Student() {
		setStID();
		setName("Mary");
		setSurname("Jane");
		setPersonCode("123456-12345");
	}
	
	//argument constructor, which initializes variables based on input parameters
	public Student(String name, String surname, String personCode) {
		setStID(); 
		setName(name);
		setSurname(surname);
		setPersonCode(personCode);
	}

	//toString
	@Override
	public String toString() {
		return stID + ": " + name + " " + surname + "[" + personCode + "]";
	}
	
	
	//other
	
}
