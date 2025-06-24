package w3resource;

public class ReverseWord
{

	public static void main(String[] args)
	{

		String str = "This is a test string";

		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++)
		{
			String st = arr[i];
			char[] ch = st.toCharArray();
			int j = 0;
			int k = ch.length - 1;

			while (j < k)
			{
				char temp = ch[j];
				ch[j] = ch[k];
				ch[k] = temp;
				j++;
				k--;

			}

			String str1 = new String(ch);
			System.out.print(str1 + " ");

		}

	}

}
