package com.hr.challenges;

import java.util.*;


public class Binary {

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		int count = 0;
		int max = 0;
		while (n > 0) {
			int reminder = n % 2;
			if (reminder == 0) {
				count = 0;
			} else {
				count++;
				if (max <= count) {
					max = count;
				}
			}
			n = n / 2;

		}

		System.out.println(max);
		scanner.close();
	}
}
