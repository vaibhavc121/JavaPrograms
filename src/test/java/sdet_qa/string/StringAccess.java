package sdet_qa.string;

public class StringAccess
{

	public static void main(String[] args)
	{
		String str = "vaibhav";
		int cnt = 0;
		char a[] = new char[str.length()];
		System.out.println(str.length());
		for (int i = 0; i < str.length(); i++)
		{
			a[i] = str.charAt(i);
		}

		for (int i = 0; i < a.length; i++)
		{
			// System.out.print(a[i]);
			cnt++;
		}
		System.out.println(cnt);
	}

}
