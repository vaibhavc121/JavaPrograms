package w3resource;

public class Fact
{
    public static int fact=1;
    public static void main(String[] args)
    {
        int num=5;
        fact(num);
        System.out.println(fact);
    }

    public static void fact(int num)
    {
        if(num>1)
        {
            fact=fact*num;
            fact(num-1);
        }
    }

}