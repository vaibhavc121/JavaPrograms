/*6.Write a program in Java to check whether a number is Palindrome or not */
import java.util.*;
class Demo
{
    public static void main(String[] args) 
    {
        int rev=0;
        Scanner s=new Scanner(System.in);
        System.out.print("enter no: ");
        int no=s.nextInt();
        int temp=no;
        
        while(no>0)
        {
            int rem=no%10;
            rev=(rev*10)+rem;
            no=no/10;
        }
        if(rev==temp)
        {
            System.out.print("palin");
        }
        else
        {
            System.out.print("not palin");
        }
        
        
    }
}