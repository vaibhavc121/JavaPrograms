package sdet_qa.interviewQuestions;

import java.util.Scanner;

public class SumOfArray
{

	public static void main(String[] args)
	{
		/*
		 * int a[]= {1,2,3,4}; int sum=0; int t;
		 * 
		 * for(int i=0;i<4;i++) { sum=sum+a[i]; }
		 * 
		 * System.out.println(sum);
		 */

		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];

		for (int i = 0; i < 5; i++)
		{
			System.out.println("enter array elements: ");
			a[i] = sc.nextInt();
		}
		for (int i = 0; i < 5; i++)
		{
			System.out.println(a[i]);
		}
	}

}
