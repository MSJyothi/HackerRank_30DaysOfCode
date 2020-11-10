package com.hr.challenges;

import java.util.*;

public class Exceptions {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String S = in.next();

		try {
			int number = Integer.parseInt(S);
			System.out.println(number);
		} catch (NumberFormatException ex) {
			System.out.println("Bad String");
		}
	}

}
