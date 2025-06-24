package sdet_qa.string;

public class CharOccurence
{

	public static void main(String[] args)
	{
		String s = "vaibhav chavan";
		int slenght = s.length();
		int length = s.replace("v", "").length();
		System.out.println(slenght - length);
	}

}
