package w3resource;

import java.util.HashMap;
import java.util.Map;

public class Test
{
    public static void main(String[] args)
    {
        String s="vaibhav ramesh chavan";
        Map<Character, Integer> data=new HashMap<>();
        char[] ch= s.toCharArray();

        for(int i=0;i<ch.length;i++)
        {
            data.put(ch[i], data.getOrDefault(ch[i], 0)+1);
        }
        System.out.print(data);

        for(Map.Entry<Character,Integer> entry: data.entrySet())
        {
//            char c='a';
//            if(entry.getKey()==c)
//            {
//                System.out.print(entry.getKey()+":"+entry.getValue());
//            }

            if(entry.getValue()>1)
            {
                System.out.println(entry.getKey());
            }
        }
    }
}