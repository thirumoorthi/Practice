package com.tmt.practice.java8.methodReference;

import java.util.List;
import java.util.function.Consumer;

import com.tmt.practice.java8.model.Student;
import com.tmt.practice.java8.model.StudentDataBase;

public class ConsumerMethodReferenceExample {



	static List<Student> students=StudentDataBase.getAllStudents();
	static Consumer<Student> printNames= (student) -> {System.out.print(student.getName()+" "); student.setName(student.getName().toUpperCase()); }; 
	// Student name changed permanently
	// Even though Consumer Functional interface implementations does not support return values, we can still store the returns in the passed objects itself.
	
	
	//static Consumer<Student> printActivities = (student) -> System.out.println(student.getActivities());
	static Consumer<Student> printActivities = Student::printListOfActivities;
	
	//static Consumer<Student> printNameActivities = (student) -> { System.out.print(student.getName()); System.out.println(student.getActivities()); };
	static Consumer<Student> printNameActivities =Student::printNameActivities;
	
	public static void main(String[] args) {
		//Consumer<String> consumerImplementation= (s) -> System.out.println(s.toUpperCase()) ;
		Consumer<String> consumerImplementation= String::toUpperCase;
		consumerImplementation.accept("thiru");
		System.out.println();
		
		System.out.println("print Names");
		students.forEach(printNames);
		System.out.println();
		System.out.println();
		
		System.out.println("print Activities");
		students.forEach(printActivities);
		System.out.println();
		
		System.out.println("print Name Activities");
		students.forEach(printNameActivities);
		System.out.println();
		
// Alternative way
		System.out.println("print name & Activities for grade >=3");
		students.forEach( student -> { if(student.getGradeLevel() >= 3) {  // (student) -> is also ok
				printNames.andThen(printActivities).accept(student);
			}
		});
		
	}

}
