/*1) Java Program to copy all elements of one array into another array */
import java.util.*;
class Demo
{
    public static void main(String[] args) 
    {
        int i;
        Scanner s=new Scanner(System.in);
       // System.out.print();
       // int no=s.nextInt();
        
        int a[]=new int[10];
        int b[]=new int[10];
        
        for(i=0;i<5;i++)
        {
            System.out.print("enter array elements: ");
            int no=s.nextInt();
            a[i]=no;
        }
        
        
        for(i=0;i<5;i++)
        {
            b[i]=a[i];
        }
        
        for(i=0;i<5;i++)
        {
           System.out.print(b[i]);
        }
        
        
    }
}