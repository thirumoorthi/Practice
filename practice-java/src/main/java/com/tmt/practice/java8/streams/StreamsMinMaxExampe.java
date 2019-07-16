package com.tmt.practice.java8.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.tmt.practice.java8.model.Student;
import com.tmt.practice.java8.model.StudentDataBase;

public class StreamsMinMaxExampe {
	
	static List<Student> students=StudentDataBase.getAllStudents();
	
	
	public static int getMaxValue(List<Integer> integers) {
		return integers.stream().reduce( 0, (a,b) -> (a > b)?a:b  );
	}
	
	
	public static int getMaxValue1000(List<Integer> integers) {
		return integers.stream().reduce( 1000, (a,b) -> (a > b)?a:b  );
	}
	
	public static Optional<Integer> getMaxValueOptional(List<Integer> integers) {
		return integers.stream().reduce( (a,b) -> (a > b)?a:b  );
		
	}
	
	public static void main(String[] args) {
		List<Integer> integerList=Arrays.asList(4,7,2,8,5,8,1);
		System.out.println(getMaxValue(integerList));
		
		System.out.println(getMaxValue(Arrays.asList()));  // prints zero which is wrong
		
		
		System.out.println("Using optional for 4,7,2,8,1 : "+getMaxValueOptional(integerList));
		System.out.println("using optional "+ getMaxValueOptional( Arrays.asList()) );  // prints zero which is wrong
		
		
		System.out.println(getMaxValue1000(integerList));  // gives 1000 
		
	//so use only optional in case of min and max calculations using reduce
		
	}
	
	
}
