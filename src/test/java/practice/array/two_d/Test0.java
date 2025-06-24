package practice.array.two_d;

public class Test0
{

	public static void main(String[] args)
	{
		String b[][] = new String[2][2];

		String a[][] =
		{
				{ "abc", "cde" },
				{ "gdh", "ert" } };
//		for (int i = 0; i < a.length; i++)
//		{
//			for (int j = 0; j < a.length; j++)
//			{
//				System.out.print(a[i][j] + " ");
//			}
//			System.out.println();
//		}
//
//		a[0][0] = "ggg";
//		System.out.println(a[0][0]);
		// System.out.println(a[0].length);

		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				b[i][j] = a[i][j];
			}
			// System.out.println();
		}

		for (int i = 0; i < a.length; i++)
		{
			for (int j = 0; j < a.length; j++)
			{
				System.out.print(b[i][j] + " ");
			}
			System.out.println();
		}

	}

}
