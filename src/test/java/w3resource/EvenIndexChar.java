package w3resource;

public class EvenIndexChar
{

	public static void main(String[] args)
	{
		String str = "w3resource.com";

		char[] ch = str.toCharArray();

		for (int i = 0; i < ch.length; i++)
		{
			if (i % 2 == 0)
			{
				System.out.print(ch[i]);
			}
		}

	}

}
