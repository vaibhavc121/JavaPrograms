package practice.collection;

import java.util.*;

public class FindDistinctWordFromString
{
    public static void main(String[] args)
    {
        String str="vaibhav vaibhav chavan";
        String[] arr=str.split(" ");

        Set<String> data=new LinkedHashSet<>();

        for(String dt:arr)
        {
            data.add(dt);
        }
        System.out.println(data);
    }


}