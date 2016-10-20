package npu.lab1.services;

import org.springframework.stereotype.Service;

import npu.lab1.domain.Student;

@Service("paymentServicePaypalRule")
public class PaymentServicePaypalRule implements PaymentService{


	@Override
	public void makePayment(Student stud, String creditCardNo){
		System.out.println("Using the PayPal credit card processor to process credit card number "+ creditCardNo+" for "+ stud.getName());
	}
	
}
