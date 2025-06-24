package practice.array;

public class Even
{
	// Write code to print only the even numbers from an array.
	public static void main(String[] args)
	{
		int a[] =
		{ 1, 2, 3, 4, 5 };

		for (int i = 0; i < 5; i++)
		{
			if (a[i] % 2 == 0)
			{
				System.out.print(a[i] + " ");
			}
		}

	}

}
