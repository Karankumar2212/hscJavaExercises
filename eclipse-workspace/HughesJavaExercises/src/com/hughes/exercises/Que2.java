package com.hughes.exercises;

/**
 * @author Karan
 *
 */
public class Que2 {
/*
 "aksajd5676@$%^"
 
	No of Numbers:
	No of Alpabets:
	Total Size:
 */
	public static void main(String[] args) {
		String str = "aksajd5676@$%^";
		char[] chr = str.toCharArray();
		int num = 0;
		int alp=0;
		int sym = 0;
		for(int i=0;i<str.length();i++) {
			if(Character.isDigit(chr[i])) {
				num++;
			}else if(Character.isLetter(chr[i])) {
				alp++;
			}else {
				sym++;
			}
		}
		System.out.println("Number of numbers: "+num);
		System.out.println("Number of alphabets: "+alp);
		System.out.println("Total size: "+(num+alp+sym));
	}
}
