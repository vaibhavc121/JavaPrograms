package techRostrum;

public class MissingNumberFinder
{

	public static void main(String[] args)
	{
		int[] arr = { 1, 2, 3, 5, 6, 7, 8, 9, 10 };

		int sumoften = 0;

		for (int i = 1; i <= 10; i++)
		{
			sumoften = sumoften + i;
		}
		System.out.println(sumoften);

		int arrSum = 0;
		for (int j = 0; j < arr.length; j++)
		{
			arrSum = arrSum + arr[j];
		}
		System.out.println(arrSum);

		System.out.println("missing no is: " + (sumoften - arrSum));

	}

}
