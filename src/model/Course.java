package model;

public class Course {
	//variables
	private long cID;
	private String title;
	private int creditPoints;
	private Professor professor;
	//setters and getters
	private static long counter = 100000;
	
	public long getcID() {
		return cID;
	}
	public void setcID() {
		this.cID = counter;
		counter++;
	}
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		if(title != null && title.matches("[A-Za-z 0-9]{4,40}")) 
			this.title = title;
		else
			this.title = "Undefined";
	}
	
	
	public int getCreditPoints() {
		return creditPoints;
	}
	
	
	public void setCreditPoints(int creditPoints) {
		if(creditPoints > 0 && creditPoints <= 20) 
		this.creditPoints = creditPoints;
	else
		this.creditPoints = 2;
	}
	
	
	public Professor getProfesor() {
		return professor;
	}
	public void setProfesor(Professor professor) {
		if(professor != null)
			this.professor = professor;
		else
			this.professor = new Professor();
	}
	
	//constructors
	public Course() {
		setcID();
		setTitle("Course");
		setCreditPoints(2);
		setProfesor(new Professor());
	}
	
	//argument constructor, which initializes variables based on input parameters
	public Course(String title, int creditPoints, Professor professor) {
		setcID(); 
		setTitle(title);
		setCreditPoints(creditPoints);
		setProfesor(professor);
	}
	//toString
	@Override
	public String toString() {
		return cID + ": " + title + " (" + creditPoints + " CP), " + professor.getName().charAt(0) + ". " + professor.getSurname();
	}
	
}
