package practice;

import java.util.HashSet;

public class RemoveDupicate
{
    public static void main(String[] args)
    {
        int[] no={1,2,3,3,5};

        HashSet<Integer> num=new HashSet<>();

        for(int i=0;i<no.length;i++)
        {
            num.add(no[i]);
        }
        System.out.println(num);
    }




}