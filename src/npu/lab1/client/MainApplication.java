package npu.lab1.client;

import java.util.ArrayList;

import npu.lab1.domain.Course;
import npu.lab1.domain.Student;
import npu.lab1.services.StudentCheckoutService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApplication {

		
	public static void main(String[] args) {
		
		ApplicationContext container = new ClassPathXmlApplicationContext("application.xml");
		StudentCheckoutService paymentService = (StudentCheckoutService) container.getBean("studentCheckoutService");
				
		Student stud = studObject();	
		
		ArrayList<Course> courseList = courseList();
		paymentService.checkout(stud, courseList, "1234567898");
		((AbstractApplicationContext) container).close();
		
	}
	
	public static Student studObject(){
		
		Student stud = new Student();
		stud.setName("Vandana");
		stud.setId(16198);
		stud.setStdStatus(true);
		stud.setLevel("graduate");
			
		return stud;
		
	}
	
	public static ArrayList<Course> courseList(){
		
		ArrayList<Course> courseList = new ArrayList<Course>();	
		Course cour = new Course();
		cour.setCourseName("Java");
		cour.setDeptName("ComputerScience");
		cour.setLevel("Graduate");
		cour.setUnits(3);
		courseList.add(cour);
		
		Course cour3 = new Course();
		cour3.setCourseName("Iphone");
		cour3.setDeptName("ComputerScience");
		cour3.setLevel("Graduate");
		cour3.setUnits(3);
		courseList.add(cour3);
		
		Course cour2 = new Course();
		cour2.setCourseName("Rest");
		cour2.setDeptName("ComputerScience");
		cour2.setLevel("Graduate");
		cour2.setUnits(3);
		courseList.add(cour2);
		
		Course cour1 = new Course();
		cour1.setCourseName("Capstone");
		cour1.setDeptName("Chemistry");
		cour1.setLevel("Graduate");
		cour1.setUnits(3);
		courseList.add(cour1);
		
		
		
		return courseList;
			
	}

}
