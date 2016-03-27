package com.github.javaccsf2016.courseregistration;

public class Course {
	private String name;
	private int maxStudent;
	
	public Course(String name, int maxStudent) {
		this.name = name;
		this.maxStudent = maxStudent;
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

}
