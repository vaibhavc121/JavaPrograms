package practice.string;



import java.util.HashMap;
import java.util.Map;

public class CountChar
{
    public static void main(String[] args)
    {
        String str = "vaibhav";
        Map<Integer, String> data = new HashMap<>();
        int counter = 0;

        for (int i = 0; i < str.length(); i++)
        {
            //char ch=str.charAt(i);
            counter++;

            //data.put(data.getOrDefault(i,0));
        }
        System.out.println(counter);
    }

}