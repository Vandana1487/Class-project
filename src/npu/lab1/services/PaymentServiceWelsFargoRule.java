package npu.lab1.services;

import org.springframework.stereotype.Service;

import npu.lab1.domain.Student;

@Service("paymentServiceWelsFargoRule")
public class PaymentServiceWelsFargoRule implements PaymentService{

	@Override
	public void makePayment(Student stud, String creditCardNo){
		System.out.println("Using the Wells Fargo credit card processor to process credit card number "+ creditCardNo+" for "+ stud.getName());
	}
	
}
