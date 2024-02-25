package com.hughes.exercises;

import java.util.Arrays;
import java.util.Collections;

/**
 * @author Karan
 *
 */
public class Que11 {
/*
 Display a,b,c,d in reverse order using arrays.
 */
	public static void main(String[] args) {
		String[] str = {"a","b","c","d"};
		for(String i : str) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		Collections.reverse(Arrays.asList(str));

		for(String i: str) {
			System.out.print(i+" ");
		}
		
	}

}
