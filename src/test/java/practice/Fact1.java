package practice;

public class Fact1
{
    public static void main(String[] args)
    {
        fact(4);
    }
    static void fact(int num)
    {
        int fact=1;
        for(int i=1;i<=num;i++)
        {

            fact=fact*i;
        }
        System.out.println(fact);
    }

}