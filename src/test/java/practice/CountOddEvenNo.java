package practice;

public class CountOddEvenNo
{
    public static void main(String[] args)
    {
        int evensum=0;
        int oddsum=0;
        for(int i=1;i<=100;i++)
        {
            if(i%2==0)
            {
                evensum=evensum+i;
            }
            else
            {
                oddsum=oddsum+i;
            }
        }
        System.out.println(evensum);
        System.out.println(oddsum);
    }
}