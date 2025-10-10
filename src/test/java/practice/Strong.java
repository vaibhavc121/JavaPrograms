package practice;

public class Strong
{
    public static void main(String[] args)
    {
        int no=146;
        int temp=145;
        int fact=1;
        int strong=0;

        while(no!=0)
        {
            int num=no%10;
            for(int i=1;i<=num;i++)
            {
                fact=fact*i;
            }
            no=no/10;
            strong=strong+fact;
            fact=1;
        }
        System.out.println(strong);
        if(temp==strong)
        {
            System.out.println("perfect");
        }
        else
        {
            System.out.println("not perfect");
        }
    }
}