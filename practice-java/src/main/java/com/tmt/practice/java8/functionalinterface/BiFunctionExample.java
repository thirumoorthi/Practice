package com.tmt.practice.java8.functionalinterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.tmt.practice.java8.model.Student;
import com.tmt.practice.java8.model.StudentDataBase;	
public class BiFunctionExample {

	static List<Student> students=StudentDataBase.getAllStudents();
	
	
	
	static BiFunction< List<Student>, Predicate<Student>, Map<String, Double> > biFUnction=( students, studentPredicate ) -> {
		Map<String, Double> studentGradeMap=new HashMap<String, Double>();
		students.forEach((student)-> {
			if(studentPredicate.test(student)) {
				studentGradeMap.put(student.getName(), student.getGpa());
			}
		});
		return studentGradeMap;
	};
	
	public static void main(String[] args) {
		
		//Passing predicate as a parameter for BiFunction  
		System.out.println(biFUnction.apply(students, PredicateExample.isGradeAbove3));
		
	}

}
