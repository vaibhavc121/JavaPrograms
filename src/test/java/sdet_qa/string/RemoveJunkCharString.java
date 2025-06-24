package sdet_qa.string;

import java.util.Scanner;

public class RemoveJunkCharString
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string");
		String s = sc.nextLine(); // vai@bhav

		System.out.println(s.replace(" ", ""));

	}

}
