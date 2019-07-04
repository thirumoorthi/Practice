package com.tmt.practice.java8.functionalinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.tmt.practice.java8.model.Student;
import com.tmt.practice.java8.model.StudentDataBase;	

public class FunctionStudentExample {

	static List<Student> students=StudentDataBase.getAllStudents();
	
	static Function<List<Student>, Map<String, Double>> studentFunction = (students) -> { 
		Map<String, Double> studentGradeMap=new HashMap<String, Double>();
		students.forEach(student -> {
			if(PredicateExample.isGPSAbove3point9.test(student)) {
			studentGradeMap.put(student.getName(), student.getGpa());
			}
		});
		return studentGradeMap;
	};  
	
	
	public static void main(String[] args) {
		System.out.println(studentFunction.apply(students));
	}
	
}
