package service;

import model.Course;
import model.Degree;
import model.Grade;
import model.Professor;
import model.Student;


import java.util.ArrayList;



public class MainService {
	
	private static ArrayList<Professor> allProfessors = new ArrayList<>();
	private static ArrayList<Student> allStudents = new ArrayList<>();
	private static ArrayList<Course> allCourses = new ArrayList<>();
	private static ArrayList<Grade> allGrades = new ArrayList<>();
	
	public static void main(String[] args) {
		Professor pr1 = new Professor();
		allProfessors.add(pr1);
		Professor pr2 = new Professor("Karina", "Skirmante", Degree.mg);
		allProfessors.add(pr2);
		Professor pr3 = new Professor("Marcis", "Naktins", Degree.mg);
		allProfessors.add(pr3);
		Professor pr4 = new Professor("Estere", "Vitola", Degree.mg);
		allProfessors.add(pr4);
		
		//TODO take a look at ArrayList class
		for(int i = 0; i < allProfessors.size(); i++) {
			System.out.println(allProfessors.get(i));
		}
		System.out.println("------------------------------------------");
		
		
		
		
		Student st1 = new Student();
		allStudents.add(st1);
		Student st2 = new Student("Annija", "Aumale");
		allStudents.add(st2);
		Student st3 = new Student("Lara", "Bernardes");
		allStudents.add(st3);
		
		for(Student tempSt : allStudents) {
			System.out.println(tempSt);
		}
		System.out.println("------------------------------------------");
		
		Course c1 = new Course();
		allCourses.add(c1);
		Course c2 = new Course("JAVA", 4, pr2);
		allCourses.add(c2);
		Course c3 = new Course("Networking", 2, pr3);
		allCourses.add(c3);
		Course c4 = new Course("Data Structures", 2, pr4);
		allCourses.add(c4);
		
		for(Course tempC : allCourses) {
			System.out.println(tempC);
		}
		System.out.println("------------------------------------------");
		
		Grade g1 = new Grade();
		allGrades.add(g1);
		Grade g2 = new Grade(7, st2, c2);
		allGrades.add(g2);
		Grade g3 = new Grade(10, st3, c4);
		allGrades.add(g3);
		Grade g4 = new Grade(8, st3, c3);
		allGrades.add(g4);
		
		for(Grade tempG : allGrades) {
			System.out.println(tempG);
		}
		System.out.println("------------------------------------------");
		
		try {
			System.out.println(st3.getName() + " " + st3.getSurname() + " -> " + calculateAVGForStudent(st3));
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
}
