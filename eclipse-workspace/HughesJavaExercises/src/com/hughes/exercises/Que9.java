package com.hughes.exercises;
import java.util.Scanner;
/**
 * @author Karan
 *
 */
public class Que9 {
	/*
	 Based on the i/p, you need to display whether it is integer or float or character or string.
	 */
	public static void main(String[] args) {
		
		System.out.println("Give input: ");
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		if(isInt(str)) {
			System.out.println("Input is Integer");
		}else if(isFloat(str)) {
			System.out.println("Input is Float");
		}else if(isChar(str)) {
			System.out.println("Input is Character");
		}else {
			System.out.println("Input is String");
		}

	}
	
	public static boolean isInt(String str) {
		try {
			Integer.parseInt(str);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}
	
	public static boolean isFloat(String str) {
		try {
			Float.parseFloat(str);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean isChar(String str) {
		return str.length() ==1;
	}

}





























