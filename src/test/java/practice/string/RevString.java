package practice.string;

public class RevString
{
    public static void main(String[] args)
    {
        String s="nayan";
        char[] ch=s.toCharArray();
        int start=0;
        int end=ch.length-1;
        while(start<end)
        {
            char temp=ch[start];
            ch[start]=ch[end];
            ch[end]=temp;
            start++;
            end--;
        }
        //String s1=new String(ch);
        if(s.equals(ch))
        {
            System.out.println("palin");
        }
        else
        {
            System.out.println("not palin");
        }

    }
}