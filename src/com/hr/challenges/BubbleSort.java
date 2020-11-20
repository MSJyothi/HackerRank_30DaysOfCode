package com.hr.challenges;

import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for (int a_i = 0; a_i < n; a_i++) {
			a[a_i] = in.nextInt();
		}
		in.close();
		int numofswaps = 0;
		for (int i = 0; i < n; i++) {
			
			for (int j = 0; j < n - 1-i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					numofswaps++;
				}
			}
		}
		
	
	

		System.out.println("Array is sorted in " + numofswaps + " swaps.");
		System.out.println("First Element: " + a[0]);
		System.out.println("Last Element: " + a[n - 1]);

	}

}
