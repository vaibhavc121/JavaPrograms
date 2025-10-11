package practice.string;

import java.util.HashMap;
import java.util.Map;

public class FirstNonReptChar
{
    public static void main(String[] args)
    {
        String s="swiss";
        char[] ch=s.toCharArray();
        HashMap<Character,Integer> data=new HashMap<>();

        for(int i=0; i<ch.length;i++)
        {
            data.put(ch[i], data.getOrDefault(ch[i],0)+1);
        }
        System.out.println(data);

        for(Map.Entry<Character,Integer> entry:data.entrySet())
        {
            int value=entry.getValue();
            if(value<2)
            {
                System.out.println(entry.getKey());
                break;
            }


        }

    }
}