package practice.string;

public class Fibo
{
    public static void main(String[] args)
    {
        int f1=0;
        int f2=1;
        int f3=1;
        System.out.print(0+" "+1+" ");

        for(int i=2;i<=10;i++)
        {
            f3=f1+f2;
            System.out.print(f3+" ");
            f1=f2;
            f2=f3;
        }
    }
}