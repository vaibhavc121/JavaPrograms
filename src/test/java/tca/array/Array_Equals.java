package tca.array;

import java.util.Arrays;

public class Array_Equals 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4};
		int b[]= {1,2,3,4};
		
		if(Arrays.equals(a,b))
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("not equals");
		}


	}

}
