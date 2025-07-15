package w3resource;

import java.util.Arrays;

public class DuplicateInStringArray
{
    public static void main(String[] args)
    {
        String str[]={"i", "am", "i", "vaibhav","chavan","vaibhav"};

        for(int i=0;i<str.length-1;i++)
        {
            for(int j=i+1;j<str.length;j++)
            {
                if(str[i].equals(str[j]))
                {
                    //System.out.print(str[i]+",");
                    str[j]=str[j+1];
                }
            }
        }
        System.out.println(Arrays.toString(str));
    }
}