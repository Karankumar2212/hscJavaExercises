package com.hughes.exercises;

/**
 * @author Karan
 *
 */

public class Que1 {
	/*
	 1) i/p:Java Fullstack
		expected o/p: jAVA fULLSTACK
	 */
	public static void main(String[] args) {
		String str = "Java Fullstack";
		
		char[] chr = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(Character.isUpperCase(chr[i])) {
				chr[i] = Character.toLowerCase(chr[i]);
			}else {
				chr[i] = Character.toUpperCase(chr[i]);
			}
		}
		
		String newStr = new String(chr); 
		
		System.out.println(newStr);
	}
}
