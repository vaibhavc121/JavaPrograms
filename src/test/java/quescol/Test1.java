package quescol;

import java.util.Scanner;

public class Test1
{

	public static void main(String[] args)
	{
//		int a[][] =
//		{
//				{ 1, 2, 3 },
//				{ 4, 5, 6 },
//
//		};
//
//		System.out.println(a[1][0]);

		int[][] array = new int[2][2];

		Scanner scanner = new Scanner(System.in);
		// Take input for each element in the 2D array
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				System.out.print("Element at [" + i + "][" + j + "]: ");
				array[i][j] = scanner.nextInt();
			}
		}

		System.out.println("The 2D array is:");
		for (int i = 0; i < 2; i++)
		{
			for (int j = 0; j < 2; j++)
			{
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}

	}

}
