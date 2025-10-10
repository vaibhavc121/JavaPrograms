package practice;

public class AscendingOrder
{
    public static void main(String[] args)
    {
        int[] no={1,3,2,4,5};

        int big=no[0];
        for(int i=1;i<no.length;i++)
        {
            if(big<no[i])
            {
                big=no[i];
            }
        }
        System.out.println("big no: "+big);

    }
}