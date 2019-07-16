package com.tmt.practice.java8.methodReference;

import java.util.function.Predicate;

import com.tmt.practice.java8.model.Student;
import com.tmt.practice.java8.model.StudentDataBase;

public class RefactorMethodReferenceExample {
	
	// How to make a code compatible for method reference syntax
	
	//static Predicate<Student> isGradeAbove3= student -> student.getGradeLevel()>=3;  //replace Lambda with method reference.
	static Predicate<Student> isGradeAbove3=RefactorMethodReferenceExample::isGradeLevelAboveThree;
	
	//the above line could be replaced by 
	
	static boolean isGradeLevelAboveThree(Student student) {
		return student.getGradeLevel()>=3;
	}
	
	public static void main(String[] args) {
		Student student= StudentDataBase.studentSupplier.get();
		//System.out.println(isGradeAbove3.test(student));
		System.out.println(isGradeAbove3.test(student));
	}
}
