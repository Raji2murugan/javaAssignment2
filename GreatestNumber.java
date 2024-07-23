package javaAssignment2;

import java.util.Scanner;

/**
 * 1. Take three numbers from the user and print the greatest number.
 */
public class GreatestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 numbers");
		int greatest=0;
		
		for(int i=0;i<3;i++)
		{
			int temp=sc.nextInt();
			greatest=(temp>greatest)?temp:greatest;
		}
		System.out.println(greatest); 

	}

}
