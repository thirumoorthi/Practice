package com.tmt.practice.java8.functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.tmt.practice.java8.model.Student;
import com.tmt.practice.java8.model.StudentDataBase;

public class BiPredicateExample {
   
	static List<Student> students=StudentDataBase.getAllStudents();
	
	static BiPredicate<Integer, Double> studentBiPredicate= (grade, gpa) -> grade >=3 && gpa >=4 ;
	
	static BiConsumer<String, List<String>> studentBiConsumer= ( name, activities ) ->  System.out.println(name+" "+activities) ;
	
	static Consumer<Student> studentConsumer= (student) -> {
		if(studentBiPredicate.test(student.getGradeLevel(), student.getGpa())) {
			studentBiConsumer.accept(student.getName(), student.getActivities());
			}
		};
	
	static void printNameAndActivities() {
		students.forEach(studentConsumer);
	}
	
	public static void main(String[] args) {
		printNameAndActivities();
	}
}
