package techRostrum;

public class Loop
{

	public static void main(String[] args)
	{
		boolean flag = false;

		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++)
			{
				if (j == 3)
				{
					System.out.println(j);
					flag = true;
					break;
				}
			}

			if (flag)
			{
				break;
			}
		}

	}

}
