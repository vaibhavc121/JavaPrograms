// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;

class HelloWorld {
    public static void main(String[] args) 
    {
       int a[][]=new int[3][3];
       
       for(int i=0;i<a.length;i++)
       {
           for(int j=0;j<a[r].length;j++)
           {
               Scanner s=new Scanner(System.in);
               System.out.print("enter value: ");
               int no=s.nextInt();
               
               a[i][j]=no;
           }
           System.out.println();
       }
       
       for(int i=0;i<3;i++)
       {
           for(int j=0;j<3;j++)
           {
               System.out.print(a[i][j]+" ");
           }
           System.out.println();
       }
    }
}