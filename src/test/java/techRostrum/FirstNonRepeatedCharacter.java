package techRostrum;

public class FirstNonRepeatedCharacter
{

	public static void main(String[] args)
	{
		String str = "swiss";

		char[] arr = str.toCharArray();

		for (int i = 0; i < arr.length - 1; i++)
		{
			for (int j = i + 1; j < arr.length; j++)
			{
				if (arr[i] != arr[j])
				{
					System.out.println("not repeated character is: " + arr[i]);
					break;

				}
			}
		}
	}

}
