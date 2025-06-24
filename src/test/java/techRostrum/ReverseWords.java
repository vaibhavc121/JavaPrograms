package techRostrum;

public class ReverseWords
{

	public static void main(String[] args)
	{
		String str = "we are learning java";
		String[] arr = str.split(" ");
		// System.out.println(arr[0]);

		int i = 0;
		int j = arr.length - 1;

		while (i < j)
		{
			String temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

		for (int k = 0; k < arr.length; k++)
		{
			System.out.print(arr[k] + " ");
		}
	}

}
