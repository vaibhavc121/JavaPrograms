package naveenAutomationLabs.javaInterviewQuestions;

public class MissingNumInArray
{

	public static void main(String args[])
	{
		int a[] =
		{ 2, 5, 1, 4, 6 };
		int actsum = 0;

		int expsum = 5 * (5 + 1) / 2;

		for (int i = 0; i < a.length; i++)
		{
			actsum = a[i] + actsum;
		}
		System.out.println("missing num is: " + (expsum - actsum));

//		int a[] =
//		{ 1, 2, 3, 4, 5, 6, 7, 8, 10 };
//
//		int expsum = 0;
//		int actsum = 0;
//		int i, j;
//
//		for (i = 1; i <= 10; i++)
//		{
//			expsum = expsum + i;
//		}
//		// System.out.println(sum);
//
//		for (j = 0; j < a.length; j++)
//		{
//			actsum = a[j] + actsum;
//		}
//
//		System.out.println("missing num is: " + (expsum - actsum));

	}

}
