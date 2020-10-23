package com.hr.challenges;

import java.util.*;

class Difference {
	private int[] elements;
	public int maximumDifference;

	// Add your code here
	public Difference(int[] elements){
	        this.elements= elements;
	    }

	public void computeDifference() {
		for (int i = 0; i < elements.length; i++) {
			for (int j = i + 1; j < elements.length; j++) {
				int diff = Math.abs(elements[i] - elements[j]);
				if (maximumDifference < diff)
					maximumDifference = diff;
			}
		}
	}

} // End of Difference class

public class DifferenceSolution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		sc.close();

		Difference difference = new Difference(a);

		difference.computeDifference();

		System.out.print(difference.maximumDifference);
	}
}
