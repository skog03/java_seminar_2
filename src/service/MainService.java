package service;

import model.Course;
import model.Degree;
import model.Grade;
import model.Professor;
import model.Student;

public class MainService {
	public static void main(String[] args) {
		Professor pr1 = new Professor();
		System.out.println(pr1);
		Professor pr2 = new Professor("Karina", "Skirmante", Degree.mg);
		System.out.println(pr2);
		
		Professor pr3 = new Professor("Marcis", "Naktins", Degree.mg);
		System.out.println(pr3);
		
		Student st1 = new Student();
		System.out.println(st1);
		Student st2 = new Student("Annija", "Aumale");
		System.out.println(st2);
		
		Course c1 = new Course();
		System.out.println(c1);
		Course c2 = new Course("JAVA", 4, pr2);
		System.out.println(c2);
		
		Course c3 = new Course("Networking", 2, pr3);
		System.out.println(c3);
		
		Grade g1 = new Grade();
		System.out.println(g1);
		
		Grade g2 = new Grade(7, st2, c2);
		System.out.println(g2);
		
		public static ArrayList<Professor> profLists = new
				ArrayList<>();
		
	}
}
