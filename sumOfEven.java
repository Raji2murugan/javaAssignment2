package javaAssignment2;

import java.util.Scanner;

/**
 * 6. Write a program to find the sum of even numbers only in a given array. Use continue.
 */
public class sumOfEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How many Number in the Array(array length)");
		int n=sc.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			int a=sc.nextInt();
			if(a%2==0)
				sum+=a;
		}
		System.out.println(sum);
		
	}

}
