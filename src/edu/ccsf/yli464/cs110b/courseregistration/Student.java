package edu.ccsf.yli464.cs110b.courseregistration;

public class Student {
	private String name;
	private String id;
	private boolean tuitionPaid;
	
	public Student(String name, String id, boolean tuitionPaid) {
		this.name = name;
		this.id = id;
		this.tuitionPaid = tuitionPaid;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getID() {
		return this.id;
	}
	
	public boolean isTuitionPaid() {
		return tuitionPaid;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setID(String ID) {
		this.id = ID;
	}
	
	public void setTuitionPaid (boolean tuitionPaid) {
		this.tuitionPaid = tuitionPaid;
	}
	
	public String toString() {
		return "Name: " + this.name 
				+ ", ID: " + this.id 
				+ ", Tuition is paid: " + this.tuitionPaid;
	}

}
