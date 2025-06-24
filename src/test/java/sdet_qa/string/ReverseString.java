package sdet_qa.string;

public class ReverseString
{

	public static void main(String[] args)
	{
		String a = "chavan";
		String rev = "";

		for (int i = a.length() - 1; i >= 0; i--)
		{
			// System.out.print(a.charAt(i));
			rev = rev + a.charAt(i);
		}
		System.out.println(rev);

		// app2- by converting string to char array type
		String b = "vaibhav";
		String rev1 = "";
		char c[] = b.toCharArray();
		for (int i = c.length - 1; i >= 0; i--)
		{
			// System.out.print(c[i]);
			rev1 = rev1 + c[i];
		}
		System.out.println(rev1);

		StringBuffer sb = new StringBuffer("string buffer");
		System.out.println(sb);

		StringBuilder sbl = new StringBuilder("builder");
		System.out.println(sbl);

		System.out.println(sb.reverse());
		System.out.println(sbl.reverse());

	}

}
