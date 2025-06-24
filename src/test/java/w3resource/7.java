/* 7. Write a Java program that takes a number as input and prints its multiplication table up to 10.*/
import java.util.*;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        int i;
        
        Scanner s=new Scanner(System.in);
        System.out.print("enter no: ");
        int no=s.nextInt();
        
        for(i=1;i<=10;i++)
        {
            System.out.println(no + " X "+ i +" = "+ no * i);
        }
       
    }
}

