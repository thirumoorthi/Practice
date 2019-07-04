package com.tmt.practice.java8.functionalinterface;

import java.util.List;
import java.util.function.Predicate;

import com.tmt.practice.java8.model.Student;
import com.tmt.practice.java8.model.StudentDataBase;

public class PredicateExample {
   
	static List<Student> students=StudentDataBase.getAllStudents();
	
	//static Predicate<Integer> predicate1= (i) -> {   return (i%2)==0;  };
	static Predicate<Integer> isEvenNumber= i -> i%2==0;
	static Predicate<Integer> isDivisibleBy5= i -> i%5==0;
	
	static Predicate<Student> isGradeAbove3= student -> student.getGradeLevel()>=3;
	static Predicate<Student> isGPSAbove3point9= student -> student.getGpa()>=3.9;
	
	public static void main(String[] args) {
		System.out.println(isEvenNumber.test(100));
		System.out.println(isEvenNumber.test(1));
		System.out.println(isEvenNumber.test(-2));
		
		System.out.println("100  :"+isEvenNumber.and(isDivisibleBy5).test(100));
		System.out.println("105  :"+isEvenNumber.and(isDivisibleBy5).test(105));
		System.out.println("110  :"+isEvenNumber.and(isDivisibleBy5).test(110));
		
		students.forEach( student -> {if(isGradeAbove3.test(student)) {
			System.out.println("Grade is 3 and above for "+student.getName()+"  Grade Level:"+student.getGradeLevel());
		}} );
		System.out.println();
		students.forEach( student -> {if(isGradeAbove3.and(isGPSAbove3point9).test(student)) {
			System.out.println("Grade is 3 and above for "+student.getName()+"  Grade Level:"+student.getGradeLevel());
		}} );
		
		System.out.println();
		students.forEach( student -> {if(isGradeAbove3.or(isGPSAbove3point9).test(student)) {
			System.out.println("Grade is 3 and above for "+student.getName()+"  Grade Level:"+student.getGradeLevel());
		}} );
		
		System.out.println();
		students.forEach( student -> {if(isGradeAbove3.or(isGPSAbove3point9).negate().test(student)) {
			System.out.println("Grade is 3 and above for "+student.getName()+"  Grade Level:"+student.getGradeLevel());
		}} );
		
		System.out.println();
		students.forEach( student -> {if(isGPSAbove3point9.negate().test(student)) {
			System.out.println("Grade is 3 and above for "+student.getName()+"  Grade Level:"+student.getGradeLevel() +"GPA Level:"+student.getGpa());
		}} );
		
				
		
		
    }
	
}
