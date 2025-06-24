package practice.array;

import java.util.Arrays;

public class Copy 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5};
		
		int b[]=Arrays.copyOf(a, 5);
		
		System.out.println(Arrays.toString(b));
		
		for(int i=0;i<5;i++)
		{
			System.out.print(b[i] + " " );	
			
		}

	}

}
