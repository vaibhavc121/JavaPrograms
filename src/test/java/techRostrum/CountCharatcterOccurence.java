package techRostrum;

public class CountCharatcterOccurence
{

	public static void main(String[] args)
	{
		String str = "java is object oriented langauge";

		int strlen = str.length();
		int length = str.replaceAll("j", "").length();
		System.out.println(strlen - length);
	}

}