/*Write a program in Java to find given number is perfect or not. */
import java.util.*;
class Demo
{
    static int perfect(int no)
    {
        int rno=no;
        int sum=0;
        for(int i=1;i<rno;i++)
        {
            if(rno%i==0)
            {
                sum=sum+i;
            }
        }
        System.out.print(sum);
        if(rno==sum)
        {
            return 1;
        }
        else
        {
            return 0;
        }
        
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter no");
        int no=s.nextInt();
        int nno=perfect(no);
        if(nno==1)
        {
            System.out.print("perfect");
        }
        else
        {
            System.out.print("not perfect");
        }
        
        
    }
}