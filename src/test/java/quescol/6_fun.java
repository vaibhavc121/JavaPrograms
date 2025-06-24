/*6.Write a program in Java to check whether a number is Palindrome or not */
import java.util.*;
class Demo
{
    
    static int palin(int no)
            {
                int rev=0;
                int temp=no;
                int tno=no;
                while(tno>0)
                {
                    int rem=tno%10;
                    rev=(rev*10)+rem;
                    tno=tno/10;
                }
                if(rev==temp)
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
        System.out.print("enter no: ");
        int no=s.nextInt();
       
        
        int rno=palin(no);
        if(rno==1)
        {
            System.out.print("palin");
        }
        else
        {
            System.out.print("not palin");
        }
        
        
        
        
    }
}