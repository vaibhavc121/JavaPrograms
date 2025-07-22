package w3resource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListToArray
{
    public static void main(String[] args)
    {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int arr[]= new int[5];

        for(int i=0;i<list.size();i++)
        {
            for (int j:list)
            {
                 arr[i]=j;
            }
        }
        System.out.println(Arrays.toString(arr));



    }
}