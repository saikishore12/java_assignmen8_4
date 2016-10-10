package com.read;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) throws Exception {

		java.io.File file = new java.io.File("C:/Users/samirishetty.OSIUS/Desktop/sample.txt");

		Scanner input = new Scanner(file);

		String fileContent = "";

		while (input.hasNext()) {
			fileContent += input.next() + " ";
		}

		input.close();

		char[] charArr = fileContent.toCharArray();

		int counter = 0;
		for (char c : charArr) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' )
				counter++;
		}

		System.out.println("Number of Vowels: " + counter);
	}
}
