package com.hughes.exercises;
/**
 * @author Karan
 *
 */
public class Que10 {
	/*
	 Add values from 239 till 699 using for loop.
	 */

	public static void main(String[] args) {
		addValues(239,699);
	}
	
	public static void addValues(int a, int b) {
		int sum = 0;
		for(int i=a;i<=b;i++) {
			sum += i;
		}
		System.out.println(sum);
	}

}
