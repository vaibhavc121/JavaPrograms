package practice.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateStringUsingMap
{
    public static void main(String[] args)
    {
        String s="i am vaibhav am i";
        Map<String, Integer> data=new HashMap<>();
        String[] s1=s.split(" ");
        for(int i=0;i<s1.length;i++)
        {
            data.put(s1[i], data.getOrDefault(s1[i],0)+1);
        }

        System.out.println(data);
        System.out.println(data.keySet());

        for( Map.Entry<String, Integer> entry:data.entrySet())
        {
            int value=entry.getValue();
            if(value>1)
            {
                System.out.println(entry.getKey());
            }
        }

    }
}