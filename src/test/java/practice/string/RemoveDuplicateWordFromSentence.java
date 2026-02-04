package practice.string;

import java.util.Arrays;

public class RemoveDuplicateWordFromSentence
{
    public static void main(String[] args)
    {
        String string="vaibhav vaibhav ramesh chavan";
        String[] str=string.split(" ");

        for(int i=0;i<str.length-1;i++)
        {
            for(int j=i+1;j<str.length;j++)
            {
                if(str[i].equals(str[j]))
                {
                    str[i]=" ";
                }
            }
        }

        System.out.print(Arrays.toString(str));

        for(int i=0;i<str.length;i++)
        {
            if(!(str[i]==" "))
            {
                System.out.print(str[i]+" ");
            }
        }

    }
}