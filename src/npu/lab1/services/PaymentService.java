package npu.lab1.services;

import npu.lab1.domain.*;


public interface PaymentService {

	public void makePayment(Student stud, String creditCardNo);
	
}
