package practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class Sort 
{

	public static void main(String[] args) 
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
		for(int i=0;i<5;i++)
		{
			System.out.println("enter array elements: ");
			a[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i] + " " );
			
			
		}
		
		Arrays.sort(a);
		
		for(int i=0;i<5;i++)
		{
			System.out.print(a[i] + " " );
			
			
		}
		
		

	}

}
