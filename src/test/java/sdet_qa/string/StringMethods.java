package sdet_qa.string;

public class StringMethods
{

	public static void main(String[] args)
	{
		// String s = "welcome";
//		String s = new String("vaibhav");
//		System.out.println(s);

		// length()
//		String s = "vaibhav";
//		int len = s.length();
		// System.out.println(s.length());
//		System.out.println(len);
//		System.out.println("hii".length());

		// concat()

		String s1 = "vaibhav";
		String s2 = "chavan";
		String s3 = "ebs";
		String s4 = "VAIBHAV";

		// System.out.println(s1 + " " + s2);
		String con = s1.concat(s2);
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(con.concat(s3));
		System.out.println(s1 + s2 + s3);

		// charAt()
		System.out.println(s1.charAt(2));

		// contains()
		System.out.println(s1.contains("ibh"));

		// equals(), equalsIgnoreCase()- compare strings

		System.out.println(s1.equalsIgnoreCase(s4));
		System.out.println(s1.equals(s4));
		System.out.println(s1.equals("vaibhav"));
	}

}
