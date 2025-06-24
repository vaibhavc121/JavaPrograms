package techRostrum;

public class ReverseEachWord
{

	public static void main(String[] args)
	{
		String str = "how are you";
		String[] arr = str.split(" ");

		for (String word : arr)
		{
			String rev = "";
			int i = word.length() - 1;
			while (i >= 0)
			{
				char ch = word.charAt(i);
				rev = rev + ch;
				i--;
			}

			System.out.print(rev + " ");

		}
	}

}
