package practice.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateFromList
{
    public static void main(String[] args)
    {
        List<Integer> data=new ArrayList<>();
        Set<Integer> data1=new HashSet<>();

        data.add(1);
        data.add(1);
        data.add(2);
        data.add(3);

        System.out.println(data);
        System.out.println(data.get(0));

        for(int dt:data)
        {
            data1.add(dt);
        }

        System.out.println(data1);
        //test

    }
}