package w3resource;

import java.util.HashMap;

public class Test0
{
    public static void main(String[] args)
    {
        String str="vaibhav ramesh chavan";
        char[] ch=str.toCharArray();
        HashMap<Character, Integer> data=new HashMap<>();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u')
            {
                data.put(ch[i], data.getOrDefault(ch[i],0)+1);
            }
        }

        System.out.println(data);
    }
}