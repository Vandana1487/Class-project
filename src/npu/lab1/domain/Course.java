package npu.lab1.domain;

public class Course {

	private String courseName;
	private String deptName;
	private String level;
	private int units; 
	private int noOfStudEnroll;
	
	public Course() {
		
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public int getUnits() {
		return units;
	}

	public void setUnits(int units) {
		this.units = units;
	}

	public int getNoOfStudEnroll() {
		return noOfStudEnroll;
	}

	public void setNoOfStudEnroll(int noOfStudEnroll) {
		this.noOfStudEnroll = noOfStudEnroll;
	}
	
	
	
	
	
}
