/*14) Java Program to sort the elements of an array in ascending order */
import java.util.*;
class Demo
{
    public static void main(String[] args) 
    {
        int i,j;
        Scanner s=new Scanner(System.in);
       // System.out.print();
        //int no=s.nextInt();
        
        int a[]={2,1,4,3,5};
        
       for(i=0;i<a.length;i++)
       {
           for(j=i+1;j<a.length;j++)
           {
               if(a[i]<a[j])
               {
                  int temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
           }
       }
       for(i=0;i<a.length;i++)
       {
           System.out.print(a[i]);
       }
        
        
    }
}