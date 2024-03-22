package service;

import model.Course;
import model.Degree;
import model.Grade;
import model.Person;
import model.Professor;
import model.Student;


import java.util.ArrayList;
import java.util.Arrays;



public class MainService {
	
	private static ArrayList<Person> allPerson = new ArrayList<>();
	private static ArrayList<Course> allCourses = new ArrayList<>();
	private static ArrayList<Grade> allGrades = new ArrayList<>();
	
	public static void main(String[] args) {
		Professor pr1 = new Professor();
		Professor pr2 = new Professor("Karina", "Skirmante","210323-12352", Degree.mg);
		Professor pr3 = new Professor("Marcis", "Naktins","235123-12354", Degree.mg);
		Professor pr4 = new Professor("Estere", "Vitola","945826-45318", Degree.mg);
		Professor pr5 = new Professor("Jesus", "Alberto","064608-40392", Degree.phd);
		Professor pr6 = new Professor("Juris", "Zagars","036524-23612", Degree.phd);
		
		allPerson.addAll(Arrays.asList(pr1, pr2, pr3, pr4, pr5, pr6));
		
		//TODO take a look at ArrayList class
		System.out.println("Professors:");
		for(int i = 0; i < allPerson.size(); i++) {
			System.out.println(allPerson.get(i));
		}
		System.out.println("------------------------------------------");
		
		
		
		
		Student st1 = new Student();
		Student st2 = new Student("Annija", "Aumale", "281103-45682");
		Student st3 = new Student("Lara", "Bernardes", "040702-21324");
		Student st4 = new Student("Viktors", "Kokins", "123516-52361");
		
		allPerson.addAll(Arrays.asList(st1, st2, st3, st4));
		
		System.out.println("Students:");
		for(Person tempSt : allPerson) {
			System.out.println(tempSt);
		}
		System.out.println("------------------------------------------");
		
		Course c1 = new Course();
		Course c2 = new Course("JAVA", 4, pr2);
		Course c3 = new Course("Networking", 2, pr3);
		Course c4 = new Course("Data Structures", 2, pr4);
		Course c5 = new Course("Object Oriented Programming", 4, pr4);
		Course c6 = new Course("Phyton", 4, pr4);
		
		allCourses.addAll(Arrays.asList(c1,c2,c3,c4, c5, c6));

		System.out.println("Courses:");
		for(Course tempC : allCourses) {
			System.out.println(tempC);
		}
		System.out.println("------------------------------------------");
		
		
		Grade g1 = new Grade();
		Grade g2 = new Grade(7, st2, c2);
		Grade g3 = new Grade(10, st3, c4);
		Grade g4 = new Grade(3, st3, c2);
		Grade g5 = new Grade(4, st3, c2);
		Grade g6 = new Grade(5, st2, c2);
		Grade g7 = new Grade(9, st2, c4);
		Grade g8 = new Grade(10, st4, c3);
		Grade g9 = new Grade(6, st4, c4);
		Grade g10 = new Grade(2, st4, c2);
		Grade g11 = new Grade(3, st3, c2);
		
		allGrades.addAll(Arrays.asList(g1, g2, g3, g4,g5,g6,g7,g8,g9,g10,g11));
		
		System.out.println("Grades:");
		for(Grade tempG : allGrades) {
			System.out.println(tempG);
		}
		System.out.println("------------------------------------------");
		
		try {
			System.out.println("Avg: " + st3.getName() + " " + st3.getSurname() + " -> " + calculateAVGForStudent(st3));
			System.out.println("Avg: " + st2.getName() + " " + st2.getSurname() + " -> " + calculateAVGForStudent(st2));
			System.out.println("Avg: " + st4.getName() + " " + st4.getSurname() + " -> " + calculateAVGForStudent(st4));
			
			System.out.println("Weighted Avg: " + st3.getName() + " " + st3.getSurname() + " -> " + wheightedAVGgrade(st3));
			System.out.println("Weighted Avg: " + st2.getName() + " " + st2.getSurname() + " -> " + wheightedAVGgrade(st2));
			System.out.println("Weighted Avg: " + st4.getName() + " " + st4.getSurname() + " -> " + wheightedAVGgrade(st4));
			
			System.out.println("Course Avg: " + c2.getTitle() + " -> " + courseAVG(c2));
			System.out.println("Course Avg: " + c3.getTitle() + " -> " + courseAVG(c3));
			System.out.println("Course Avg: " + c4.getTitle() + " -> " + courseAVG(c4));
			
			System.out.println("Courses taught by : " + pr4.getName()+ " " + pr4.getSurname() + " -> " + coursesPerProfessor(pr4));
			System.out.println("Courses taught by : " + pr3.getName()+ " " + pr3.getSurname() + " -> " + coursesPerProfessor(pr3));
			System.out.println("Courses taught by : " + pr2.getName()+ " " + pr2.getSurname() + " -> " + coursesPerProfessor(pr2));
			
			
			System.out.println("------------------------------------------");
			
			System.out.println("All students and their average grade:");
			for(Person tempP : allPerson) {
				if(tempP instanceof Student) {
					Student tempst = (Student)tempP;
					System.out.println(tempst.getName() + " " + tempst.getSurname() + " -> " + calculateAVGForStudent(tempst));
				}
				
			}
			System.out.println("------------------------------------------");
			
			
			//sortStudentsByAVG();
			
			System.out.println("Sorted students by average:");
			for(Person tempP : allPerson) {
				if(tempP instanceof Student) {
					Student tempst = (Student)tempP;
					System.out.println(tempst.getName() + " " + tempst.getSurname() + " -> " + calculateAVGForStudent(tempst));
				}
				
				
			}
			
			System.out.println("------------------------------------------");
			
			System.out.println("Nr of professors with PhD: " + countOfPhds());
			
			System.out.println("------------------------------------------");
			
			System.out.println("Fails in: "+ c2.getTitle() + " -> "+ countOfFails(c2));
			
			System.out.println("------------------------------------------");
			
			System.out.println("CRUD function testing:");
			
			createStudent("Janis","Berzins", "031097-34233");
			createStudent("Jekabs","Berzins","120901-23122");
			
			System.out.println("Added new Students:");
			for(Person tempP : allPerson) {
				if (tempP instanceof Student) {
					System.out.println(tempP);
				}
				
			}
			
			System.out.println("------------------------------------------");
			
			System.out.println("Retrieve student annija by person code:");
			Student temp = retrieveStudentByPersonCode("281103-45682");
			System.out.println(temp);
			
			System.out.println("------------------------------------------");
			
			updateStudentByPersonCode("Jekabs", "Kokins", "120901-23122");
			
			System.out.println("update name of jekabs berzins to jekabs kokins:");
			for(Person tempP : allPerson) {
				if (tempP instanceof Student) {
					System.out.println(tempP);
				}
				
			}
			
			
			
			
			deleteStudent("031097-34233");
			
			System.out.println("------------------------------------------");
			System.out.println("delete student Janis Berzins:");
			for(Person tempP : allPerson) {
				if (tempP instanceof Student) {
					System.out.println(tempP);
				}
				
			}
			
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	
		
	
	
	
	public static float calculateAVGForStudent(Student inputstudent) throws Exception{
		if(inputstudent == null) throw new Exception("Problems with input");
		
		float sum = 0;
		int howMany = 0;
		
		for(Grade tempgr : allGrades) {
			if(tempgr.getStudent().equals(inputstudent)) {
				sum =sum + tempgr.getValue();
				howMany++;
			}
		}
		return sum/howMany;
	}
	
	//calculates average grade based on course credit points (weighted average grade) for each student
	//Java 6 (4cp) datastruct 8(2kp) = ((6* 4KP) + (8* 2KP))/(4KP + 2 KP)
	
	public static float wheightedAVGgrade(Student inputStudent) throws Exception {
		if(inputStudent == null) throw new Exception("Problems with input");
		
		float sum = 0;
		int howMany = 0;
		
		for(Grade tempgr : allGrades) {
			if(tempgr.getStudent().equals(inputStudent)) {
				sum =sum + (tempgr.getValue()*tempgr.getCourse().getCreditPoints());
				howMany = howMany + tempgr.getCourse().getCreditPoints();
			}
		}
		return sum/howMany;
	}
	
	// method which calculates average grade for each course
	
	public static float courseAVG(Course inputcourse) throws Exception {
		if(inputcourse == null) throw new Exception("Problems with input");
		
		float sum = 0;
		int count = 0;
		
		for(Grade tempgr : allGrades) {
			if(tempgr.getCourse().equals(inputcourse)) {
				sum = sum + tempgr.getValue();
				count++;
			}
		}
		return sum/count;
	}
	
	//method which calculates how many courses does professor teach
	
	public static int coursesPerProfessor(Professor inputProf) throws Exception {
		if(inputProf == null) throw new Exception("Problems with input");
		
		int count = 0;
		
		for(Course tempC : allCourses ) {
			if(tempC.getProfesor().equals(inputProf)) {
				count++;
			}
		}
		return count;
	}
	
	//method which sort all students by their average grade

	/*
	public static void sortStudentsByAVG() throws Exception {
		
		for(int i = 0; i < allPerson.size(); i++) {
			for(int j = 0; j < allPerson.size(); j++){
				
				Person tempI = allPerson.get(i);
				Person tempJ = allPerson.get(j);
				
				if(calculateAVGForStudent(tempJ) < calculateAVGForStudent(tempI)) {
					Person temp = allPerson.get(i);
					allPerson.set(i, allPerson.get(j));
					allPerson.set(j, temp);
				}
			}
		}
		
	}
	*/
	
	
	//TODO
	
	//how many professors have phD
	
	public static int countOfPhds() {
		
		int count = 0;
		
		for(Person tempP : allPerson ) {
			if(tempP instanceof Professor) 
			{
				Professor tempPr = (Professor)tempP;
				
				if(tempPr.getProfdegree().equals(Degree.phd)) 
				{
					count++;
				}
			}
		}
		return count;
	}
	
	//how many grades are smaller than 4 in specific course
	
	public static int countOfFails(Course inputcourse) throws Exception{
		if(inputcourse == null) throw new Exception("Problems with input");
		
		int count = 0;
		
		for(Grade tempG : allGrades) {
			if(tempG.getCourse().equals(inputcourse) && tempG.getValue() < 4) {
				count++;
			}
		}
		return count;
	}
	
	// how many CP prof needs to lead
	
	
	//CRUD, Create, Retrieve, Update, Delete
	
	public static Student retrieveStudentByPersonCode(String inputPersonCode) throws Exception {
		//TODO
		//do validation
		if(inputPersonCode == null) throw new Exception("Wrong input");
		//need to go thru allStudents list and check if student is there
		for(Person tempP : allPerson) {
			if(tempP instanceof Student) 
			{
				Student tempSt = (Student)tempP;
				
				if(tempSt.getPersonCode().equals(inputPersonCode)) {
					//if it is: return the student
					return tempSt;
				}
			}
		}
		//after for loop, necessary to throw exception
		throw new Exception("Student not found");
	}
	

	
	
	
	
	
	
	
	
	
	
	
	public static void createStudent(String name, String surname, String personCode) throws Exception {
		//TODO
		
		//do validation
		if(name == null || surname == null || personCode == null) throw new Exception("Wrong input");
		//go thru allStudents list
		for(Person tempP : allPerson) {
			//check if student already in list with personCode
			if(tempP instanceof Student) {
				Student tempst = (Student) tempP; 
				
				if (tempst.getPersonCode().equals(personCode)) {
					//if is throw exception{student already in system}
					throw new Exception("Student is already in system");
				}
			}
		}
		
		//if is not: create new student
		Student newStudent = new Student(name, surname, personCode);
		//store new student in allStudents arrayList
		allPerson.add(newStudent);
	}

		
	
	public static void updateStudentByPersonCode(String name, String surname, String inputPersonCode) throws Exception {
		if (name == null || surname == null || inputPersonCode == null) throw new Exception("Wrong input");
		
		for(Person tempP : allPerson) {

			if (tempP instanceof Student && tempP.getPersonCode().equals(inputPersonCode)) {
				tempP.setName(name);
				tempP.setSurname(surname);
				return;
			}
				
			

		}
		
		throw new Exception("Student not found");
	}
	
	

	
	public static void deleteStudent(String personCode) throws Exception{
		if (personCode == null) throw new Exception("Wrong input");
		
		for(Person tempP : allPerson) {
			if (tempP instanceof Student && tempP.getPersonCode().equals(personCode)) {
				allPerson.remove(tempP);
				return;
				}
			}
		throw new Exception("Student not found");
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

