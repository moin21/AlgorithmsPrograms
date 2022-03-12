package com.algorithmprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BubbleSort {
	static List<Integer> integerList = new ArrayList<>();
	static Random random = new Random();

	public static void main(String[] args) {
		scanArrayList();
		System.out.println("Before Sort:");
		printArrayList();
		bubbleSortArrayList();
		System.out.println("After Sort:");
		printArrayList();
	}

	/**
	 * @purpose: Ability to BubbleSort sort
	 * 
	 * @param: No parameters
	 * 
	 * @function : sorts the given list in ascending order and stores them in their
	 *           indepandencies
	 * 
	 * @return: No return value.
	 */
	private static void bubbleSortArrayList() {
		for (int i = 1; i < integerList.size(); i++) {
			int size = integerList.size();

			for (int j = 0; j < size - 1; j++)

				for (int k = 0; k < size - j - 1; k++)

					if (integerList.get(k).compareTo(integerList.get(k + 1)) > 0) {

						// swapping occurs if elements
						// are not in the intended order
						Integer temp = integerList.get(k);
						integerList.set(k, integerList.get(k + 1));
						integerList.set(k + 1, temp);
					}
		}
	}

	/**
	 * @purpose: Ability to print array list
	 * 
	 * @param: No parameters
	 * 
	 * @function : prints the array list pre defined to string
	 * 
	 * @return: No return value.
	 */
	private static void printArrayList() {
		System.out.println(integerList);
	}

	/**
	 * @purpose: Ability to scan array list
	 * 
	 * @param: No parameters
	 * 
	 * @function : scan the array list from random numbers
	 * 
	 * @return: No return value.
	 */
	private static void scanArrayList() {
		for (int i = 0; i < 10; i++) {
			integerList.add(random.nextInt(999) + 1);
		}
	}

}