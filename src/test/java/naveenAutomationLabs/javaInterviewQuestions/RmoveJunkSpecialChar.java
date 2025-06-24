package naveenAutomationLabs.javaInterviewQuestions;

public class RmoveJunkSpecialChar
{

	public static void main(String[] args)
	{
		String s = "@@#@@$vaibhav $@$$@c121 ";
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
