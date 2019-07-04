package com.tmt.practice.java8.functionalinterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

	static BinaryOperator<String> concatenationBinaryOperator= ( firstName,lastName) -> {return firstName.concat(lastName); };
	
	static Comparator<Integer> comparator = ( int1, int2) -> int1.compareTo(int2);
	
	public static void main(String[] args) {
		System.out.println(concatenationBinaryOperator.apply("Thirumoorthi", "Jothy"));
				
		BinaryOperator<Integer> minOperator=BinaryOperator.minBy(comparator);
		System.out.println(minOperator.apply(3, 4));
		
		BinaryOperator<Integer> maxOperator=BinaryOperator.maxBy(comparator);
		System.out.println(maxOperator.apply(3, 4));

	}

}
