package quescol;

public class Test2
{

	public static void add(int a)
	{
		if (a <= 100)
		{
			System.out.println(a);
			a++;
			add(a);
		}
	}

	public static void main(String[] args)
	{
//		String a = "vaibhav";
//		char b[] = new char[10];
//		b = a.toCharArray();
//		System.out.println(b[0]);

		add(1);
	}

}
