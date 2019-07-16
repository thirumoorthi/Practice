package com.tmt.practice.java8.lambda;

import java.util.function.Consumer;

public class LabmmdaVariableName {

	public static void main(String[] args) {

		int i=0;
		//First restriction
		       //Consumer<Integer> c1= (i) -> {};  not allowed
		            Consumer<Integer> c1= (i1) -> {};
		            //int i = 1; // not allowed
	}

}
