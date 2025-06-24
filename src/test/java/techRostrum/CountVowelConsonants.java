package techRostrum;

public class CountVowelConsonants
{

	public static void main(String[] args)
	{
		String str = "vaibhav";
		char[] ch = str.toCharArray();

		int vowelcounter = 0;
		int consonantcounter = 0;

		for (int i = 0; i < ch.length; i++)
		{

			if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u')
			{
				vowelcounter++;
			} else
			{
				consonantcounter++;
			}

		}

		System.out.println("vowels: " + vowelcounter + "," + "consonant: " + consonantcounter);

	}
}
