package practice.array;

public class Largest
{
	// Largest Number in an Array?
	public static void main(String[] args)
	{
		int a[] =
		{ 10, 20, 30, 40 };
		// System.out.println(a[0]);
		int big = a[0];

		for (int i = 1; i <= 3; i++)
		{
			if (a[i] > big)
			{
				big = a[i];
			}
		}
		System.out.println(big);

	}

}
