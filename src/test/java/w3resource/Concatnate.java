package w3resource;

public class Concatnate
{

	public static void main(String[] args)
	{
		String str1 = "vaibhav123.@-";
		String str2 = "vaibhav chavan";

		// System.out.println(str1.contains(str2));

		System.out.println(str1.replace('v', 'a'));
		System.out.println(str1.replace("ibh", "hbi"));
		System.out.println(str1.replaceAll("[^a-z]", " "));

		char[] ch = str2.toCharArray();
		// System.out.println(ch);

	}

}
