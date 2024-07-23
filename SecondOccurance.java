package javaAssignment2;

import java.util.Scanner;

/**
 * 4. Write a program to find second occurrence of a given number in an array
 */

public class SecondOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array length");
		int n = sc.nextInt();
		System.out.println("Enter the array values");
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("ENter which value find second occurance");
		int val = sc.nextInt();

		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == val) {
				count++;
				if (count == 2) {
					System.out.println("The value " + val + "is second occured index is " + i);
					break;
					}
			}
		}

		if (count != 2) {
			System.out.println("The value "+ val + " have no second occurance");
		}
	}

}
