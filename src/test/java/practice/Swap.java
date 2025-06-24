import java.util.*;
class Swap
{
    public static void main(String[] args) 
        {
            int a,b,temp;;
            
            Scanner s=new Scanner(System.in);
            System.out.print("enter 1st no: ");
            a=s.nextInt();
            
            System.out.print("enter 2nd no: ");
            b=s.nextInt();
            
            /*temp=a;
            a=b;
            b=temp;*/
            
            /*a=a*b;
            b=a/b;
            a=a/b;*/
            
            a=a+b;
            b=a-b;
            a=a-b;
            
            
            System.out.print("after swap-"+ "a: "+a+" "+ "b: " +b);
            
        }
}