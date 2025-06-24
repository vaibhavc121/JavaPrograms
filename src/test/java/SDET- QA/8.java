/* */
import java.util.*;
class Demo
{
    public static void main(String[] args) 
    {
        int sum=0,mod;
        Scanner s=new Scanner(System.in);
        System.out.print("enter number: ");
        int no=s.nextInt();
        
        while(no>0)
        {
            mod=no%10;
            sum=sum+mod;
            no=no/10;
           
        }
        
        System.out.println("sum: "+sum);
   
        
       
       
       
        
        
    }
}