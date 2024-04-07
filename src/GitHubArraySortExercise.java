

import java.io.*;
import java.util.*;
//student name: Weijun Shi
//Id: 100408663
//INFO4190

public class GitHubArraySortExercise {
	public static void main(String a[]) {
		String[] arr1 = { "9", "14", "3", "5", "43", "11", "58", "22" };
		//String[] arr1 = { "Edmonton", "Ottawa","Vancouver","Toronto", "Winnipeg", "Montreal", "Calgary" };
		int[] ints;
		Boolean isInteger= true; 
		System.out.println("Before Sort");
		for (String i : arr1) {
			System.out.print(i + " ");
			//check if the array 
			if (ValidIntegerArray.checkElement(i)==false) {
				isInteger= false;
			}
		}
		System.out.println();
		
		
		if(isInteger) {
			//convert string array to integer array
			ints = Arrays.stream(arr1).mapToInt(Integer::parseInt).toArray();
			//sorting the integer array by calling function of Insertion sort
			//IntegerArraySort.insertionSort(ints);
			//display the sorted array
			System.out.println("This is an integer array,and after Sort");
			for (int i : ints) {
				System.out.print(i + " ");
			}
		}else {
			//else the array is the string array, call the function of string array sort
			//StringArraySort.arraySort(arr1);
			//display the sorted array
			System.out.println("This is a string array, and after Sort");
			for (String i : arr1) {
				System.out.print(i + " ");
			}
		}
		
	

		
	}
}
