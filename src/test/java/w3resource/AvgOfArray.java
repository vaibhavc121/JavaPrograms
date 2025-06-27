package w3resource;

public class AvgOfArray
{
    public static void main(String[] args)
    {
        int[]arr={5,2,1,4,3};
        int sum=0;
        for (int i = 0; i < arr.length; i++)
        {
            sum=sum+arr[i];

        }
        System.out.println(sum/arr.length);

    }
}