//Copyright (c) 2016 LeoYulin & califoxco (Jiaming Yang)
package com.github.javaccsf2016.courseregistration;

public class Course {
	private String name;
	private int maxStudent;
	private Student[] roster;
	
	public Course(String name, int maxStudent) {
		this.name = name;
		this.maxStudent = maxStudent;
		this.roster = new Student[maxStudent]; 
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getMaxStudent() {
		return this.maxStudent;
	}
	
		public void setName(String name) {
			this.name = name;
		}
		
		public void setMaxStudent (int maxStudent) {
			if (maxStudent > 0) {
				this.maxStudent = maxStudent;
			}
		}
	public String toString() {
		return "Course Name: " + this.name 
				+ ", Maximum Student: " + this.maxStudent;
	}
	
	public boolean addStudent(Student s) {
		if (this.roster.length <= this.maxStudent && s.isTuitionPaid()) {
			for(int i = 0; i < this.roster.length; i++) {
				if(this.roster[i] == null) {
					this.roster[i] = s;
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean dropStudent(Student s) {
		for (int i = 0; i < this.roster.length; i++) {
			if (this.roster[i].getID() == s.getID()) {
				this.roster[i] = null;
				return true;
			}
		}
		return false;
	}
	
	public void printRoster() {
		int totalNumberOfStudent = 0;
		System.out.println("Roster: ");
		for (int i = 0; i < this.roster.length; i++) {
			if (!(this.roster[i] == null)) {
				totalNumberOfStudent++;
				System.out.println(this.roster[i].getName());
			}
		}
		if (totalNumberOfStudent > 0) {
			System.out.println("There are " + totalNumberOfStudent + " students enrolled in this class");
		} else {
			System.out.println("There is no student enrolled in this class");
		}
	}

}
