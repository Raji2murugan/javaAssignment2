package javaAssignment2;

/**
 * 5. Write a program to print prime numbers between 1 to 30
 */

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		for (int i = 2; i <= 30; i++) {
			count=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
					count++;
				
			}
			if(count==2)
				System.out.print(i+"  ");
		}
	}

}
