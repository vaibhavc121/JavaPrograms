package w3resource;

import java.util.Arrays;

public class RevArray
{
    public static void main(String[] args)
    {
        int arr[]={1,2,3,4,5};
//        for(int i=arr.length-1;i>=0;i--)
//        {
//            System.out.print(arr[i]+",");
//        }

        int start=0;
        int end=arr.length-1;

        while(arr[start]<arr[end])
        {
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;

            start++;
            end--;
        }

        System.out.print(Arrays.toString(arr));
    }
}