/*3. Write a Java program that takes three numbers from the user and prints the greatest number.*/

import java.util.*;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        
        System.out.print("enter 1st no: ");
        int a=s.nextInt();
        
        System.out.print("enter 2nd no: ");
        int b=s.nextInt();
        
        System.out.print("enter 3rd no: ");
        int c=s.nextInt();
        
        if(a>b && a>c)
        {
            System.out.print(a + "is greater");
        }
        else if(b>a && b>c)
        {
            System.out.print(b + "is greater");
        }
        else
        {
            System.out.print(c+ " is greater");
        }
        
        
    }
}