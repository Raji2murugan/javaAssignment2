package javaAssignment2;

import java.util.Scanner;

/**
 * 3. Write a program to print multiplication table of a given number in a neat format
 */

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Which Multiplication Table You want");
		int mulTable=sc.nextInt();
		
		for(byte i=1;i<=16;i++)
		{
			System.out.println(i+" * "+mulTable+" = "+(mulTable*i));
		}
		

	}

}
