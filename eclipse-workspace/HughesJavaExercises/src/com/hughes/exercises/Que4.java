package com.hughes.exercises;

/**
 * @author Karan
 *
 */

public class Que4 {

	/*
	 i/p: abcdef
	 o/p: f1 e2 d3 c4 b5 a6
	 */

	public static void main(String[] args) {
		String str = "abcdef";
		char[] ch = str.toCharArray();
		int counter = 1;
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(ch[i]+""+counter+" ");
			counter++;
		}
		
	}

}
