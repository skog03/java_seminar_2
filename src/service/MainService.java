package service;

import model.Degree;
import model.Professor;
import model.Student;

public class MainService {
	public static void main(String[] args) {
		Professor pr1 = new Professor();
		System.out.println(pr1);
		Professor pr2 = new Professor("Karina", "Skirmante", Degree.mg);
		System.out.println(pr2);
		
		Student st1 = new Student();
		System.out.println(st1);
		Student st2 = new Student("Annija", "Aumale");
		System.out.println(st2);
	}
}
