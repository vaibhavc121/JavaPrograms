package techRostrum;

public class LargestElement
{

	public static void main(String[] args)
	{
		int[] arr = { 2, 1, 3, 5, 4 };

		int largest = arr[0];

		for (int i = 1; i < arr.length; i++)
		{
			if (arr[i] > largest)
			{
				largest = arr[i];
			}
		}

		System.out.println(largest);
	}

}
