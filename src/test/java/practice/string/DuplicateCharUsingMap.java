package practice.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharUsingMap
{
    public static void main(String[] args)
    {
        String s="vaibhav";
        Map<Character, Integer> data=new HashMap<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            data.put(ch[i], data.getOrDefault(ch[i],0)+1);
        }

        System.out.println(data);
        System.out.println(data.keySet());

        for( Map.Entry<Character, Integer> entry:data.entrySet())
        {
            int value=entry.getValue();
            if(entry.getValue()>1)
            {
                System.out.print(entry.getKey()+":"+entry.getValue()+", ");
            }
        }

    }
}