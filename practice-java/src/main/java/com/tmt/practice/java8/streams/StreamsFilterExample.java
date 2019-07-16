package com.tmt.practice.java8.streams;

import java.util.List;
import java.util.function.Predicate;

import com.tmt.practice.java8.model.Student;
import com.tmt.practice.java8.model.StudentDataBase;

public class StreamsFilterExample {
		
	static List<Student> students=StudentDataBase.getAllStudents();
	static Predicate<Student> studentsPredicate=(student) -> student.getGpa() > 3.8;
	
	
	public static void main(String[] args) {

		//students.stream().filter( (student) -> student.getGpa() > 3.8);
		students.stream().filter( student -> student.getGpa() > 3.8);
		students.stream().filter(studentsPredicate);
	
	}

}
