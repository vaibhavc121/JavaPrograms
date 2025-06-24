package practice.array;

public class Exception 
{

	public static void main(String[] args) 
	{
		int a[]= {1,2,3};
		
		try 
		{
			System.out.println(a[3]);
		}
		
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		finally
		{
			System.out.println("test");
		}
	
		

	}

}
