package kukkadapu.string;

public class VowelsConsonants
{
	// Java program to Count Vowels and Consonants in a given string
	public static void main(String[] args)
	{
		String a = "vaibhav";
		int vowel = 0;
		int cons = 0;
		char b[] = new char[0];

		for (int i = 0; i < a.length(); i++)
		{
			b[i] = a.charAt(i);
		}

		for (int i = 0; i < a.length(); i++)
		{
			if (b[i] == 'a' || b[i] == 'e' || b[i] == 'i' || b[i] == 'o' || b[i] == 'u')
			{
				vowel++;
			}
			else
			{
				cons++;
			}
		}
		System.out.println("vowels count: " + vowel + " |" + " consonant count: " + cons);
	}

}
