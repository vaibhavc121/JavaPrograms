package practice.string;

import practice.SumOfTen;

import java.util.HashSet;

public class RemoveDuplicate
{
    public static void main(String[] args)
    {
        String str="vaibhav";
        HashSet<Character>ch=new HashSet<>();
        char[] c=str.toCharArray();

        for(int i=0;i<c.length;i++)
        {
            ch.add(c[i]);
        }
        System.out.println(ch);
    }
}