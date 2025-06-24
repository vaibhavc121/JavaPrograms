/*Write a program in Java to find sum of digits of a number */
import java.util.*;
class Demo
{
    static int sum(int no)
    {
        int rno=no;
        int rev=0;
        while(rno>0)
        {
            int rem=rno%10;
            rev=rev+rem;
            rno=rno/10;
        }
        return rev;
    }
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter no: ");
        int no=s.nextInt();
        
        //int nno=sum(no);
        System.out.print(sum(no));
        
        
    }
}