package com.tmt.practice.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import com.tmt.practice.java8.model.Student;
import com.tmt.practice.java8.model.StudentDataBase;

public class StreamsLimitSkipExample {
	static List<Student> students=StudentDataBase.getAllStudents();
	
	public static Integer sumLimit(List<Integer> integers){
		return integers.stream()
				.limit(2)   // limit to the first two elements
				.reduce(0, (a,b) -> a + b );
	}	
	
	public static Integer sumskip(List<Integer> integers){
		return integers.stream()
				.skip(2)  // skip the first two elements
				.reduce(0, (a,b) -> a + b );
	}
	
	public static void main(String[] args) {
		
		List<Integer> integers=Arrays.asList(10,10,1,2,3);
		System.out.println( sumLimit(integers)  );
		
		//List<Integer> integers=Arrays.asList(3,4,5,6,7);
		System.out.println( sumskip(integers)  );
	}
}
