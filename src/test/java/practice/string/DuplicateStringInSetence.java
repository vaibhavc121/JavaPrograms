package practice.string;

import java.sql.SQLOutput;
import java.util.Arrays;

public class DuplicateStringInSetence
{
    public static void main(String[] args)
    {
        String s="i am vaibhav am sdet engg vaibhav";
        String[] s1=s.split(" ");

        for(int i=0;i<s1.length-1;i++)
        {
            for(int j=i+1;j<s1.length;j++)
            {
                if(s1[i].equals(s1[j]))
                {
                    System.out.print(s1[i]+", ");
                }
            }
        }
    }


}