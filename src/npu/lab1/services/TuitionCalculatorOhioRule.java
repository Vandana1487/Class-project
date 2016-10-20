package npu.lab1.services;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import npu.lab1.domain.Course;
import npu.lab1.domain.Student;

@Service("tuitionCalculatorOhioRule")
public class TuitionCalculatorOhioRule implements TuitionCalculatorService {
	
	@Override
	public double computeTutition(Student stud, ArrayList<Course> cou) {
		double cost=0;
	
//		For undergraduate students the cost is $100 per course unit; for graduate students the cost is $120 per course unit
		if(stud.getLevel() == "undergraduate"){
			for(int i=0; i< cou.size(); i++){
				cost = cost + cou.get(i).getUnits()*100;
//				An extra $50 “lab fee” is added to every course from the Chemistry department
				if (cou.get(i).getDeptName() == "Chemistry"){
					cost = cost + 50;
				}	
			}	

		}else{
			for(int i=0; i< cou.size(); i++){
				cost = cost + cou.get(i).getUnits()*120;
//				An extra $50 “lab fee” is added to every course from the Chemistry department
				if (cou.get(i).getDeptName() == "Chemistry"){
					cost = cost + 50;
				}
			}	
		}
		
//		A 10% surcharge is added to the above cost for international students
		
		if(stud.isInternationalStud()){
		cost = cost + (cost*10)/100;
		}

		return cost;	
	}
}
