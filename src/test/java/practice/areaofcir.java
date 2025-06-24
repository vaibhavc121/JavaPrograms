import java.io.*;
import java.util.*;
class Test
{
     public static void main(String[] args)
     {
         final float PI=3.14f;
         Scanner s=new Scanner(System.in);
         System.out.print("enter radius of circle: ");
         float r=s.nextFloat();
         System.out.print("area of circle: "+ PI*r*r);
         
     }
}