package practice.string;



import java.util.HashMap;
import java.util.Map;

public class CountChar
{
    public static void main(String[] args)
    {
        String str="vaibhav";
        Map<Integer, String> data=new HashMap<>();

        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);

            //data.put(data.getOrDefault(i,0));
        }
    }

}