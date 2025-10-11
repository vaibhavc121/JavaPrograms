package practice.string;

public class LastfourCharFromString
{
    public static void main(String[] args)
    {
        String s="vaibhav";

        int s1=s.length();
        int s2=s1-4;
        System.out.println(s2);
        System.out.println(s.substring(s2));
        System.out.println(s.substring(s.length()-4));
    }


}