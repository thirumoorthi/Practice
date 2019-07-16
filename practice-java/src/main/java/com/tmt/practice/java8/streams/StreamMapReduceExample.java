package com.tmt.practice.java8.streams;

import java.util.List;
import java.util.Optional;

import com.tmt.practice.java8.model.Student;
import com.tmt.practice.java8.model.StudentDataBase;

public class StreamMapReduceExample {

	static List<Student> students=StudentDataBase.getAllStudents();
	
	public static int numberOfNoteBooks(List<Student> students) {
		
		
		// PATTERN : Map filter and reduce example
		Optional<Integer> result = students.stream()
				.filter((student)-> student.getGender().equals("female") )
				//.reduce((n1,n2)-> n1+n2);	
				.map(Student::getNoteBooks)
				.peek((inte)-> {System.out.println(inte);})
				.reduce(Integer::sum);
		if(result.isPresent()) {
			return result.get();
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
	System.out.println(numberOfNoteBooks(students));
	
	}
}
