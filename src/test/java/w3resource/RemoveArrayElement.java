package w3resource;

import java.util.Arrays;

public class RemoveArrayElement
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6};

        int rem=2;

        for(int i=rem;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
    }
}