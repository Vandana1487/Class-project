package npu.lab1.services;

import java.util.ArrayList;

import npu.lab1.domain.*;

public interface TuitionCalculatorService {

	public double computeTutition(Student stud, ArrayList<Course> cou );
}
