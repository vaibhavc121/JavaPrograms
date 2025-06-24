package quescol;

import java.util.Scanner;

public class Test0
{
	public static void main(String args[])
	{
		int a[][] = new int[2][2];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i <= 1; i++)
		{
			for (int j = 0; j <= 1; j++)
			{

				System.out.println("enter value: ");
				a[i][j] = sc.nextInt();
			}
		}

		for (int i = 0; i <= 1; i++)
		{
			for (int j = 0; j <= 1; j++)
			{

				System.out.print(a[i][j]);
			}
			System.out.println();

		}
	}

}
