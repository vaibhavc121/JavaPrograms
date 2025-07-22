package w3resource;

import java.util.ArrayList;
import java.util.List;

public class ArrayToArrayList
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);

        }
        System.out.println(list);



    }
}