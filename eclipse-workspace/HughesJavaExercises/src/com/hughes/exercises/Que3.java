package com.hughes.exercises;

/**
 * @author Karan
 *
 */
public class Que3 {

	/*
	 Write a java program for below requirement
     	i/p: Hyderabad
     	o/p: dabaredyH
	 */
	public static void main(String[] args) {
		String str = "Hyderabad";
		StringBuilder newStr = new StringBuilder(str);
		newStr.reverse();
		String reversedString = newStr.toString();
		System.out.println(reversedString);
		
		/////////////////////////////////////////////
		
		String st = "Ranchi";
		String newSt = "";
		for(int i=st.length()-1;i>=0;i--) {
			newSt += st.charAt(i);
		}
		System.out.println(newSt);
	}
}
