package com.tmt.practice.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.tmt.practice.java8.model.Student;
import com.tmt.practice.java8.model.StudentDataBase;

public class StreamsReduceExample {

	public static Integer performMultiplication(List<Integer> integerList) {
		return integerList.stream()
				.reduce(1, (a,b) -> a*b );
		
	}
	
	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> integerList) {
		return integerList.stream()
				.reduce( (a,b) -> a*b );
		
	}
	
	public static Optional<Student> getHighestGPAStudent(List<Student> students) {
		Optional<Student> result=students.stream().reduce((s1,s2) -> (s1.getGpa() > s2.getGpa())?s1:s2  );
		return result;
	}
	
	static List<Student> students=StudentDataBase.getAllStudents();
	public static void main(String[] args) {
		//reduce is the second terminal operation
		// used to reduce the contents of a stream to a single value.
		
		//takes two parameters first one is default or initial value
		//second one is the binary operator
		
		// binary operator takes two inputs of the same type and returns a single input of the original type
		
		List<Integer> integers=Arrays.asList(1,3,5,7);

		System.out.println(performMultiplication(integers));
		Optional<Integer> result = performMultiplicationWithoutIdentity(integers);
		System.out.println(result.isPresent());
		if(result.isPresent()) {
		System.out.println(result.get());}
		
		Optional<Integer> result1 = performMultiplicationWithoutIdentity(Arrays.asList());
		System.out.println(result1.isPresent());
		if(result1.isPresent()) {
			System.out.println(result1.get());}
	
	
		Optional<Student> result3 = getHighestGPAStudent(students);
		System.out.println(result3.isPresent());
			if(result3.isPresent()) {
				System.out.println(result3.get());
			}
		}
	}

