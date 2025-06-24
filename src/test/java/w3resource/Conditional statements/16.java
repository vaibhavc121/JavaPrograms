/*16. Write a Java program to display the pattern like a right angle triangle with a number. */
import java.util.*;
class HelloWorld 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.print("enter rows: ");
        int r=s.nextInt();
        
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
       
    }
}