package com.tmt.practice.java8.functionalinterface;

import java.util.List;
import java.util.function.BiConsumer;

import com.tmt.practice.java8.model.Student;
import com.tmt.practice.java8.model.StudentDataBase;

public class BiConsumerExample {
	
	static BiConsumer<String, String> printStrings = (str1, str2) -> System.out.println("str 1 is "+ str1 +" str2 is "+str2);
	static BiConsumer<Integer, Integer> multiply = (int1, int2) -> {System.out.println("Multiply:"+ int1 * int2); int1=new Integer(10000);};  //call by Value Integers are immutable.
	static BiConsumer<Integer, Integer> divide = (int1, int2) -> System.out.println("Divide:"+int1 / int2); 
	
	static BiConsumer<String, List<String>> printNameActivities = (name, activities) -> System.out.println(name +" Performs "+ activities);
	
	public static void main(String[] args) {
		printStrings.accept("Thirumoorthi ", "Jothy");
		
		multiply.accept(4,2);
		divide.accept(8,2);
		Integer thousand=new Integer(1000);
		Integer five=new Integer(20);
		multiply.andThen(divide).accept(thousand, five);
	
		List<Student> students=StudentDataBase.getAllStudents();
		students.forEach(student -> printNameActivities.accept(student.getName() ,student.getActivities() ));
	}
	
	
}
