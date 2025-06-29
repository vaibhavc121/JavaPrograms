package w3resource;

import java.util.Arrays;

public class CopyArray
{
    public static void main(String[] args)
    {
        int[] arr=new int[5];

        int[] arr1={1,2,3,4,5};

        for(int i=0;i<arr1.length;i++)
        {
            arr[i]=arr1[i];
        }

        System.out.println(Arrays.toString(arr));
    }
}