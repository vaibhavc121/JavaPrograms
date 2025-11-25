package practice.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindDistinctWordFromWord
{
    public static void main(String[] args)
    {
        String str="vaibhav";
        char[] ch=str.toCharArray();

        Set<Character> data=new LinkedHashSet<>();

        for(char c:ch)
        {
            data.add(c);
        }

        System.out.println(data);
    }
}