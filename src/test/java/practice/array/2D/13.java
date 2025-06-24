/*13) Java Program to right rotate the elements of an array */
import java.util.*;
class Demo
{
    public static void main(String[] args) 
    {
        int i;
        Scanner s=new Scanner(System.in);
       // System.out.print();
        //int no=s.nextInt();
        
        int a[]={1,2,3,4,5};
        
        int temp=a[4];
        
        for(i=4;i>0;i--)
        {
            a[i]=a[i-1];
        }
        a[0]=temp;
        
        for(i=0;i<a.length;i++)
        {
            System.out.print(a[i]);
        }
        
        
    }
}