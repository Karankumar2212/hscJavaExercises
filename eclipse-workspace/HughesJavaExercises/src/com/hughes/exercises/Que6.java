package com.hughes.exercises;

/**
 * @author Karan
 *
 */
public class Que6 {
	/*
	 i/p: 3
     o/p: +++

   	 i/p: 4
   	 o/p: ++++
	 */

	public static void main(String[] args) {
		printPlus(3);
		printPlus(4);
	}
	
	public static void printPlus(int x) {
		for(int i=0;i<x;i++) {
			System.out.print("+"+" ");
		}
		System.out.println();
	}
}
