package com.tmt.practice.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.tmt.practice.java8.functionalinterface.PredicateExample;
import com.tmt.practice.java8.model.Student;
import com.tmt.practice.java8.model.StudentDataBase;

public class StreamsFlatMapExample {
	
	
	public static void main(String[] args) {
		List<String> studentactivities=StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities) // when each and every element is a set or a list like in this case, we need to use flat map
				.flatMap(List::stream)
				.distinct() // removes duplicates
				.sorted()
				.collect(Collectors.toList());
  		System.out.println(studentactivities);
	}
	
	
	public static Long getStudentActivitiesCount() {
		Long count=StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities) // when each and every element is a set or a list like in this case, we need to use flat map
				.flatMap(List::stream)
				.distinct() // removes duplicates //returns stream<String> 
				.count();
		return count;
		
		
	}
	
}
