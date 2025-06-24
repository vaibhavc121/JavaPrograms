package easyEngineeringClasses;

public class DgtFreqCount
{

	public static void main(String[] args)
	{
		int no = 256664567;
		int cnt = 0;

		while (no > 0)
		{
			no = no / 10;
			cnt++;
		}
		System.out.println(cnt);
	}

}
