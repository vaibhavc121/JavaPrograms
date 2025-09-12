package w3resource;

public class StringExist
{
    public static void main(String[] args)
    {
        String s1="java";
        String s2="ja";

        for(int i=0;i<s2.length();i++)
        {
            if(!s1.contains(String.valueOf(s2.charAt(i)) ))
            {
                System.out.println("false");
            }
        }
        System.out.println("contains");
    }
}