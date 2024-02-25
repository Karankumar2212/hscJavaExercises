package com.hughes.exercises;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Karan
 *
 */
public class Que13 {
	/*
	 * Write a Java program to remove duplicate elements from a given array and
	 * return the updated array length. Sample array: [20, 20, 30, 40, 50, 50, 50]
	 * After removing the duplicate elements the program should return 4 as the new
	 * length of the array.
	 */

	public static void main(String[] args) {
		int arr[] = { 20, 20, 30, 40, 50, 50, 50 };
		int count = removeDuplicates(arr);

		System.out.println(count);

	}

	public static int removeDuplicates(int[] arr) {
		Arrays.sort(arr);
		ArrayList newArr = new ArrayList();
		newArr.add(arr[0]);
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				newArr.add(arr[i + 1]);
			}
		}
		return newArr.size();
	}

}
