package w3resource;

public class MaxInArray
{
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5};

        int max=arr[0];

        for(int i=1;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
            }
        }
        System.out.println(max);

    }
}