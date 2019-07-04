package com.tmt.practice.java8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparableLambdaExample {
	
	public static void main(String[] args) {
		
		
		//Prior to java 8
		Comparator<Integer> comparator=new Comparator<Integer>() {
			@Override
			public int compare(Integer i1, Integer i2) {
				return i1.compareTo(i2);
			};
		};
		List<Integer> list1 = Arrays.asList(new Integer[]{3,25,5});
		Collections.sort(list1, comparator);
		System.out.println(list1);
		
		// java 8
		//Comparator<Integer> comparatorLambda = (Integer i1, Integer i2) -> {return i1.compareTo(i2);};
		// Comparator<Integer> comparatorLambda = (Integer i1, Integer i2) -> i1.compareTo(i2);
		Comparator<Integer> comparatorLambda = ( i1,  i2) -> i1.compareTo(i2);
		
				List<Integer> list2 = Arrays.asList(new Integer[]{3,25,5});
				Collections.sort(list2, comparatorLambda);
				System.out.println(list2);
		
	}

}
