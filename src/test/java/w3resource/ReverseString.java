package w3resource;

public class ReverseString
{

	public static void main(String[] args)
	{

		String str = "Reverse words in a given string";
		String[] arr = str.split(" ");

		int j = 0;
		int k = arr.length - 1;

		while (j < k)
		{
			String temp = arr[j];
			arr[j] = arr[k];
			arr[k] = temp;
			j++;
			k--;
		}

		for (int m = 0; m < arr.length; m++)
		{
			System.out.print(arr[m] + " ");
		}

	}

}
