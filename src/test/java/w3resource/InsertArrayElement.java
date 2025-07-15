package w3resource;

public class InsertArrayElement
{
    public static void main(String[] args)
    {
        int[] arr={1,2,6,4,5};

        int add=6;

        for(int i=1;i<arr.length;i++)
        {
            arr[i]=arr[i+1];
        }
    }
}