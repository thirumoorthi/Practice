package com.tmt.practice.java8.streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.tmt.practice.java8.model.Student;
import com.tmt.practice.java8.model.StudentDataBase;

public class SteamsMapExample {
     public static void main(String[] args) {
		List<String> studentNames=StudentDataBase.getAllStudents().stream()
				//transform student to name
				// map is used to convert from one type to another
				//map is used to TRANSFORM
				.map(Student::getName)
				.collect(Collectors.toList()); 
		
		System.out.println(studentNames);
		
		
		
		List<String> studentNames2=StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toList());  // lsit of String
		
		System.out.println(studentNames2);
		
		Set<String> studentNames3=StudentDataBase.getAllStudents().stream()
				.map(Student::getName)
				.map(String::toUpperCase)
				.collect(Collectors.toSet());  //set of String
		
		System.out.println(studentNames2);
		
		
	}
}
