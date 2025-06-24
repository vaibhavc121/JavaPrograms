package w3resource;

public class SumOfDigit
{

	public static void main(String[] args)
	{
		String str = "ab5c2d4ef12s";

		char[] ch = str.toCharArray();
		int num = 0;
		for (int i = 0; i < ch.length; i++)
		{
			char ch1 = ch[i];

			if (Character.isDigit(ch1))
			{
				int digit = Character.getNumericValue(ch1);
				num = num + digit;
			}

		}
		System.out.println(num);

	}

}
