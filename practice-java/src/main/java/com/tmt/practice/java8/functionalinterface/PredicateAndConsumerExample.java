package com.tmt.practice.java8.functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.tmt.practice.java8.model.Student;
import com.tmt.practice.java8.model.StudentDataBase;

public class PredicateAndConsumerExample {
	
	List<Student> students=StudentDataBase.getAllStudents();
	
	Predicate<Student> studentPredicate1= student -> student.getGradeLevel() >= 3;
	Predicate<Student> studentPredicate2= student -> student.getGpa() >= 3.9;
	
	BiConsumer<String, List<String>> studentBiConsumer=(name, activityList) -> System.out.println("name:" +name+ " Activity:"+activityList); 
	
	Consumer<Student> studentConsumer= student -> {
		if(studentPredicate1.and(studentPredicate2).test(student)) {
			studentBiConsumer.accept(student.getName(), student.getActivities());
		}
	};
	
	public void printNameAndActivities() {
		students.forEach(studentConsumer);
	}
	
	public static void main(String[] args) {
		new PredicateAndConsumerExample().printNameAndActivities();
	}
}
