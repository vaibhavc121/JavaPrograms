/* */
import java.util.*;
class Adam
{
    public static void main(String[] args) 
    {
        int sum=0;
        
        Scanner s=new Scanner(System.in);
        System.out.print("enter no: ");
        int no=s.nextInt();
        int temp=no;
        
        while(no>0)
        {
            int rem=no%10;
            sum=sum+(rem*rem*rem);
            no=no/10;
        }
        
        if(temp==sum)
        {
             System.out.print("armstrg");
        }
        else
        {
            System.out.print("not armstrg");
        }
        
        
    }
}