package exceptionHandling;

public class Eh0
{

	public static void main(String[] args)
	{
		try
		{
			int result = 10 / 0; // This will throw ArithmeticException
		}
		catch (Exception e)
		{
			// System.out.println("Error: " + e.getMessage()); // Handle the exception
			System.out.println(e.toString());
		}
	}

}
