package model;

public class Grade {
	
	//variables
	private long gID;
	private int value;
	private Student student;
	private Course course;
	
	//setters and getters
	private static long counter = 200000;
	
	public long getgID() {
		return gID;
	}
	public void setgID() {
		this.gID = counter;
		counter++;
	}
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		if(value >= 0 && value <= 10) 
			this.value = value;
		else
			this.value = 0;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		if(student != null)
			this.student = student;
		else
			this.student = new Student();
		}
	
	public Course getCourse() {
		return course;
	}
	public void setCourse(Course course) {
		if(course != null) {
			this.course = course;
		}
		else this.course = course;
		
	}
	
	//constructors
	
	public Grade() {
		setgID();
		setValue(0);
		setStudent(new Student());
		setCourse(new Course());
	}
	
	//argument constructor, which initializes variables based on input parameters
	public Grade(int value, Student student, Course course) {
		setgID();
		setValue(value);
		setStudent(student);
		setCourse(course);
	}
	

	//toString
	@Override
	public String toString() {
		return gID + ": " +  student.getName().charAt(0) + ". " + student.getSurname() + " gets " + value + " in " + course.getTitle();
	}
	
	
}
