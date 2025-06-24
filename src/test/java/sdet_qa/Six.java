
package sdet_qa;

import java.util.Scanner;

public class Six {

	public static void main(String[] args) 
	{
		int cnt=0,mod;
        Scanner s=new Scanner(System.in);
        System.out.print("enter number: ");
        int no=s.nextInt();
        
        while(no>0)
        {
            //mod=no%10;
            cnt++;
            no=no/10;
           
        }
        
        System.out.println("cnt"+cnt);
	}

}
