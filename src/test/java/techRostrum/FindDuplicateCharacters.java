package techRostrum;

public class FindDuplicateCharacters
{

	public static void main(String[] args)
	{
		String str = "vaibhav";
		char[] ch = str.toCharArray();

		System.out.print("repeated characters are: ");

		for (int i = 0; i < ch.length - 1; i++)
		{
			for (int j = i + 1; j < ch.length; j++)
			{
				if (ch[i] == ch[j])
				{
					System.out.print(ch[i] + " ");
				}
			}
		}
	}

}
