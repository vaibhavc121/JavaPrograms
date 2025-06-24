package sdet_qa.string;

public class CountWords
{

	public static void main(String[] args)
	{
		String s = "i am disco dancer";
		int count = 1;

		for (int i = 0; i < s.length(); i++)
		{
			if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
