package practice;

public class Prime
{
    public static void main(String[] args)
    {
        for(int j=0;j<=20;j++)
        {
            int no=j;
            int i;
            for(i=1;i<no;i++)
            {
                if(no%i==0)
                {
                    break;
                }
            }
            if(i==no)
            {
                System.out.println(no + " prime");
            }
            else
            {
                System.out.println(no +" not prime");
            }
        }

    }

}