package sdet_qa;

import java.util.Scanner;

//Write code to check if a number is palindrome?
public class PalinNum
{
	public static void palin(int no)
	{
		int rno = no;
		int rev = 0;

		while (no > 0)
		{
			// 1234
			int mod = no % 10;
			rev = (rev * 10) + mod;
			no = no / 10;

		}
		if (rno == rev)
		{
			System.out.println(rev + " is palin");
		}
		else
		{
			System.out.println(rev + " is not palin");
		}

	}

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num: ");
		int no = sc.nextInt();
		palin(no);
		sc.close();

	}

}
