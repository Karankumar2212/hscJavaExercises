package com.hughes.exercises;

/**
 * @author Karan
 *
 */
public class Que7 {
	/*
	 String a = "Computer"
     o/p: "r e t u p m o C"
	 */

	public static void main(String[] args) {
		String a = "Computer";
		char[] ch = a.toCharArray();
		for(int i=a.length()-1;i>=0;i--) {
			System.out.print(ch[i]+" ");
		}
	}
}
