/*11. Write a Java program to display n terms of natural numbers and their sum. */
import java.util.*;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.print("enter term: ");
        int no=s.nextInt();
        
        for(int i=1;i<=no;i++)
        {
            sum=sum+i;
        }
        
        System.out.print(sum);
        
       
    }
}