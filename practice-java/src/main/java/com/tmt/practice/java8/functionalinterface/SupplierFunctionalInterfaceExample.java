package com.tmt.practice.java8.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.tmt.practice.java8.model.Student;
import com.tmt.practice.java8.model.StudentDataBase;

public class SupplierFunctionalInterfaceExample {

	
	static Supplier<Student> studentSupplier= () -> { 
		return new Student("Adam",2,3.6, "male",Arrays.asList("swimming", "basketball","volleyball")); 
		};
	static Supplier<List<Student>> studentsSupplier= () -> { 
		return StudentDataBase.getAllStudents(); 
	};
	
	
	public static void main(String[] args) {
		System.out.println(studentSupplier.get());
		System.out.println();
		System.out.println(studentsSupplier.get());
	}

}
