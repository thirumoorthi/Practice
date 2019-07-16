package com.tmt.practice.java8.constructorreference;

import java.util.function.Function;
import java.util.function.Supplier;

import com.tmt.practice.java8.model.Student;

public class ConstructorReferenceExample {

	static Supplier<Student> studentSupplier=Student::new; 
	static Function<String, Student> studentSupplierWithName=Student::new;
	
	public static void main(String[] args) {
			System.out.println(studentSupplier.get());
			System.out.println(studentSupplierWithName.apply("Thirumoorthi"));
	}

}
