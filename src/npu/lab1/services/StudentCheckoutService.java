package npu.lab1.services;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import npu.lab1.domain.Course;
import npu.lab1.domain.Student;

public class StudentCheckoutService {
		
	@Autowired
	@Qualifier("paymentServiceWelsFargoRule")
	private PaymentService paymentService;
	
	@Autowired
	@Qualifier("tutitionCalculatorNationalRule")
	private TuitionCalculatorService tuitionCalculatorService;

	public StudentCheckoutService() {		
	}	
	
	public void setPaymentService(PaymentService payService){
		this.paymentService = payService;
	}
	
public void setTuitionCalculatorService(TuitionCalculatorService tuitionCalService){
		this.tuitionCalculatorService = tuitionCalService;
	}
	
	public void checkout(Student stud, ArrayList<Course> cou, String creditCardNo){
			
		registerCourse(stud, cou);
		
		//Compute the tuition bill
		double amount = this.tuitionCalculatorService.computeTutition(stud, cou);
		System.out.println("The Fees for Student "+stud.getName()+" is: $"+ amount);
		
		paymentService.makePayment(stud, "12345678989");
						
	}
	
	public void registerCourse(Student stud, ArrayList<Course> cou){
		int count = 0;
		stud.setCourse(cou);
		for (int i = 0; i < cou.size(); i++) {
			cou.get(i).setNoOfStudEnroll(count++);
			
		}	
	}
	
	@PostConstruct
	void initCheckoutBean(){
		System.out.println("Initiallizing Method is called!!!");
	}

	@PreDestroy
	void destroyCheckoutBean(){
		System.out.println("Destory Method gets callled!!!");
	}
}
