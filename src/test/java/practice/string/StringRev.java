package practice.string;

public class StringRev
{

	public static void main(String[] args)
	{
		String str = "rohit";
		char ch;
		char a[] = new char[str.length()];

		for (int i = 0; i < str.length(); i++)
		{
			a[i] = str.charAt(i);
		}
		int i = 0;
		int j = a.length - 1;

		while (i < j)
		{
			ch = a[i];
			a[i] = a[j];
			a[j] = ch;

			i++;
			j--;
		}
		i = 0;
		for (i = 0; i < str.length(); i++)
		{
			System.out.print(a[i]);
		}

	}

}
