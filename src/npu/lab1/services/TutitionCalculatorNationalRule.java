package npu.lab1.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import npu.lab1.domain.Course;
import npu.lab1.domain.Student;

@Service("tutitionCalculatorNationalRule")
public class TutitionCalculatorNationalRule implements TuitionCalculatorService {

	@Override
	public double computeTutition(Student stud, ArrayList<Course> cou) {
	
		double cost=0;
		
//		For international students the cost is $500 per course unit; for other students the cost is $230 per course unit
		if(stud.isInternationalStud()){
			int  courList = cou.size();
			for(int i=0; i< cou.size(); i++){
				//System.out.println(courList);
//				cost = cost + cou[i].getUnits()*500;
				cost = cost + cou.get(i).getUnits()* 500;
			}			
		}else{
			for(int i=0; i> cou.size(); i++){
				cost = cost + cou.get(i).getUnits()*230;
			}	
		}
		return cost;
	}

}
