package techRostrum;

public class StringReverese
{

	public static void main(String[] args)
	{
		String str = "vaibhav";
		char[] arr = str.toCharArray();

		int i = 0;
		int j = arr.length - 1;

		while (i < j)
		{
			char temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
		// System.out.println(arr);

		String s = new String(arr);
		System.out.println(s);

	}

}
