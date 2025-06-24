/* */
import java.util.*;
class Demo
{
    public static void main(String[] args) 
    {
        int cntevn=0,cntodd=0,mod;
        Scanner s=new Scanner(System.in);
        System.out.print("enter number: ");
        int no=s.nextInt();
        
        while(no>0)
        {
            mod=no%10;
            if(mod%2==0)
            {
                cntevn++;
            }
            else
            {
                cntodd++;
            }
            no=no/10;
        }
        
        System.out.println("even"+cntevn);
        System.out.println("odd"+cntodd);
        
       
       
       
        
        
    }
}