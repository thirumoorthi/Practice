package com.tmt.practice.java8.streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import com.tmt.practice.java8.functionalinterface.PredicateExample;
import com.tmt.practice.java8.model.Student;
import com.tmt.practice.java8.model.StudentDataBase;

public class StreamsExample {
	
	public static void main(String[] args) {
		Map<String, List<String>> studentNameActivityMap=StudentDataBase.getAllStudents().stream()
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		
		Map<String, List<String>> studentNameGradeMapGreaterThans3= StudentDataBase.getAllStudents().stream()
				.filter(PredicateExample.isGradeAbove3).collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(studentNameGradeMapGreaterThans3);
		
		
	}

}
