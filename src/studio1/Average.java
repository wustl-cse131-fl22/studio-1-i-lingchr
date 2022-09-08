package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter first integer to be averaged: ");
		int n0 = in.nextInt();
		System.out.println("Enter second integer to be averaged: ");
		int n1 = in.nextInt();
		double avg = ((double) n0 + n1) / 2;
		System.out.println("The average of the integers is: " + avg);
	}

}
