/*12) Java Program to print the sum of all the items of the array*/
import java.util.*;
class Demo
{
    public static void main(String[] args) 
    {
        int i,sum=0;
        Scanner s=new Scanner(System.in);
        int a[]={1,2,3,4,5};
        
        for(i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }
        
        System.out.print(sum);
            
        
        
    }
}