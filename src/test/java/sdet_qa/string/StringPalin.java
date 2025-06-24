package sdet_qa.string;

import java.util.Scanner;

public class StringPalin
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.nextLine();

		// String s = "vaibhav";
		String rev = "";

		for (int i = s.length() - 1; i >= 0; i--)
		{
			rev = rev + s.charAt(i);
		}

		if (s.equals(rev))
		{
			System.out.println("palin");
		}
		else
		{
			System.out.println("not palin");
		}

	}

}
