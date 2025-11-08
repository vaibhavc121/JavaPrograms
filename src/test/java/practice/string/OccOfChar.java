package practice.string;

public class OccOfChar
{
    public static void main(String[] args)
    {
        String s="vaibhav";
        int counter=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='i')
            {
                counter++;
            }
        }
        System.out.println(counter);
    }
}