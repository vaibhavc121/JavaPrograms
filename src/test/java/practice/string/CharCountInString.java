package practice.string;

public class CharCountInString
{
    public static void main(String[] args)
    {
        String s="vaibhav ramesh chavan";
        String s1=s.replaceAll(" ","");

        int count=s1.length()-s1.replaceAll("a", "").length();

        System.out.println(s1.length()-s1.replaceAll("a", "").length());

        //


    }
}