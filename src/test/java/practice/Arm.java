package practice;

public class Arm
{
    public static void main(String[] args)
    {
        int no=407;
        int temp=no;
        int arm=0;

        while(no!=0)
        {
            int num=no%10;
            arm=arm+(num*num*num);
            no=no/10;
        }

        if(arm==temp)
        {
            System.out.println("arm");
        }
        else {
            System.out.println("not arm");
        }


    }
}