//Copyright (c) 2016 LeoYulin & califoxco (Jiaming Yang)
package com.github.javaccsf2016.courseregistration;

public class Tester {

	public static void main(String[] args) {
		Student student1 = new Student("Nyaa", "ID01024", true);
		Student student2 = new Student("Nyan", "ID02048", true);
		Student student3 = new Student("Nya", "ID04096", true);
		Student student4 = new Student("Meow", "ID04096", true);
		Student student5 = new Student("Miao", "ID08192", true);
		Student student6 = new Student("Nyaaa", "ID16384", true);
		
		Course neko = new Course("neko", 5);
		
		System.out.println(neko);
		
		neko.printRoster();
		
		neko.addStudent(student1);
		neko.addStudent(student2);
		neko.addStudent(student3);
		neko.addStudent(student4);
		neko.addStudent(student5);
		
		System.out.println("Status of adding: " + neko.addStudent(student6));
		
		neko.printRoster();
		
		neko.dropStudent(student3);
		
		neko.printRoster();
		
		neko.addStudent(student6);
		
		neko.printRoster();
	}

}
