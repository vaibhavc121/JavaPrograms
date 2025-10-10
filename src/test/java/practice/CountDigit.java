package practice;

public class CountDigit
{
    public static void main(String[] args)
    {
        int no=12345;
        int counter=0;

        while(no!=0)
        {
            counter++;
            no=no/10;
        }
        System.out.println(counter);
    }
}