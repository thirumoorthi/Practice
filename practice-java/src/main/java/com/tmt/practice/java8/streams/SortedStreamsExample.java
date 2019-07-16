package com.tmt.practice.java8.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.tmt.practice.java8.model.Student;
import com.tmt.practice.java8.model.StudentDataBase;



public class SortedStreamsExample {

	public static Comparator<String> stringComparator=(string1, string2) ->  string2.compareTo(string1); 
	
	public static void main(String[] args) {
		System.out.println("Sorted activities");
		sortedActivities().forEach(System.out::println);
		
		System.out.println("Sort students by name");
		sortStudentsByName().forEach(System.out::println);
	}

	
	
	public static List<String> sortedActivities() {
		List<String> studentactivities=StudentDataBase.getAllStudents().stream()
				.map(Student::getActivities) // when each and every element is a set or a list like in this case, we need to use flat map
				.flatMap(List::stream)
				.distinct() // removes duplicates
				.sorted(stringComparator)   // sorted 
				.collect(Collectors.toList());
		return studentactivities;
	}
	
	public static List<Student> sortStudentsByName() {
		List<Student> sortedStudentList=StudentDataBase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getName))  // sorted
				.collect(Collectors.toList());
		return sortedStudentList;
		}
	
		public static List<Student> sortStudentsByNameReversed() {
			List<Student> sortedStudentList=StudentDataBase.getAllStudents().stream()
					.sorted(Comparator.comparing(Student::getName).reversed())  // reversed
					.collect(Collectors.toList());
		
		
		return sortedStudentList;
	}
	
}
