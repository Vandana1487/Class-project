package npu.lab1.domain;

import java.util.ArrayList;

public class Student {

	
	private String name;
	private int id;
	private boolean internationalStud;
	private String level;
	private ArrayList<Course> course; 
	
	
	public Student() {
		super();
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public boolean isInternationalStud() {
		return internationalStud;
	}


	public void setStdStatus(boolean internationalStud) {
		this.internationalStud = internationalStud;
	}


	public String getLevel() {
		return level;
	}


	public void setLevel(String level) {
		this.level = level;
	}


	public ArrayList<Course> getCourse() {
		return course;
	}


	public void setCourse(ArrayList<Course> cou) {
		this.course = cou;
	}
	
	
	
	
	
}
