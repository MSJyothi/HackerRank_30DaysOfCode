package com.hr.challenges;

import java.util.*;

public class PrintEvenOddIndex {

	public static void splitString(String input) {
		StringBuffer left = new StringBuffer();
		StringBuffer right = new StringBuffer();

		for (int i = 0; i < input.length(); i++) {
			if (i % 2 == 0) {
				left.append(input.charAt(i));
			} else {
				right.append(input.charAt(i));
			}
		}

		System.out.println(left.toString() + " " + right.toString());

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		scanner.nextLine();

		for (int i = 0; i < testCases; i++) {
			String input = scanner.nextLine();
			splitString(input);
		}

		scanner.close();
	}

}
