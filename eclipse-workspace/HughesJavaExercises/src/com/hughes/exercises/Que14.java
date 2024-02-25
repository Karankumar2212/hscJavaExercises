package com.hughes.exercises;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author Karan
 *
 */
public class Que14 {
	/*
	 * Program to find duplicate numbers in an array if it contains
	 * multiple duplicates?
	 */

	public static void main(String[] args) {
		int arr[] = { 20, 20, 30, 40, 50, 50, 50 };
		removeDuplicates(arr);

	}

	public static void removeDuplicates(int[] arr) {
		Arrays.sort(arr);
		ArrayList newArr = new ArrayList();

		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] == arr[i + 1]) {
				newArr.add(arr[i]);
				while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
					i++;
				}
			}
		}

		System.out.println(newArr);

	}

}
