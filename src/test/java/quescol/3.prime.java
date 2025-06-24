/*3.Write a program in Java to check given number is prime or not. */
import java.util.*;
class Adam
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter no: ");
        int no=s.nextInt();
        
        for(int i=1;i<no;i++)
        {
            if(no%i==0)
            {
                
                break;
            }
        }
        
        
        
        if(i==no)
        {
            System.out.print("prime");
        }
        else
        {
            System.out.print("not prime");
        }
        
        
    }
}