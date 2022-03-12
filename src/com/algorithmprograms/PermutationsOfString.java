package com.algorithmprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationsOfString {
/**
 * 
 * @param word
 */
	public static void permutataionIteratively(String word) {

		if (word == null || word.length() == 0)
			return;
		ArrayList<String> permutationWords = new ArrayList<>();
		permutationWords.add(String.valueOf(word.charAt(0)));

		for (int index = 1; index < word.length(); index++) {
			for (int index2 = permutationWords.size() - 1; index2 >= 0; index2--) {
				String currentPermutation = permutationWords.remove(index2);
				for (int index3 = 0; index3 <= currentPermutation.length(); index3++) {
					permutationWords.add(currentPermutation.substring(0, index3) + word.charAt(index)
							+ currentPermutation.substring(index3));
				}
			}
		}
		System.out.println(permutationWords);

	}

	/**
	 * Method to print permutations of string using Recursion Create ArrayList of
	 * String type - permutatedrecur Check if string is empty If not for every index
	 * value create char with ithChar create restOfString by printing substrings of
	 * remaining indices Call method internally using restOfString as word and
	 * permutatedWord+ithChar as PermutetedWord
	 * 
	 * @param word           - String given to make permutations
	 * @param permutatedWord - Sent space string for space between permutations
	 */
	public static void permutationRecursively(String word, String permutatedWord) {
		ArrayList<String> permutatedrecursively = new ArrayList<>();
		if (word.length() == 0) {
			System.out.print(permutatedWord + " ");
			return;
		}
		for (int index = 0; index < word.length(); index++) {
			char ithChar = word.charAt(index);
			String restOfString = word.substring(0, index) + word.substring(index + 1);
			permutationRecursively(restOfString, permutatedWord + ithChar);
		}
	}

	public static void main(String[] args) {

		Scanner scannerObject = new Scanner(System.in);

		System.out.println("Enter the String To Permutate");
		String word = scannerObject.next();
		scannerObject.close();

		System.out.println("Permutation by Iterating : ");
		permutataionIteratively(word);

		System.out.println("Permutation by Recursion : ");
		permutationRecursively(word, "");

	}

}