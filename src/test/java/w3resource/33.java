/* 33. Write a Java program and compute the sum of an integer's digits.*/
import java.util.*;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        int rem,ans=0;
        
        
        Scanner s=new Scanner(System.in);
        System.out.print("enter no: "); //25
        int no=s.nextInt();
        
        while(no>0)
        {
            rem=no%10;
            ans=ans+rem;  
            no=no/10;
            
        }
        
         System.out.print(ans);
        
       
    }
}

