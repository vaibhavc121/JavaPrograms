package practice.string;

import practice.Str;

import java.util.Arrays;

public class RevWordInSentence
{
    public static void main(String[] args)
    {
        String s="vaibhav ramesh chavan";
        String[] s1=s.split(" ");

        for(String word:s1)
        {
            char[] ch=word.toCharArray();
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
            System.out.print(new String(ch)+" ");

        }


    }
}