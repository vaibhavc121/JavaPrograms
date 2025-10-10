package practice;

public class Rev
{
    public static void main(String[] args)
    {
        int no=121;
        int temp=no;
        int rev=0;

        while(no!=0)
        {
            int mod=no%10;
            rev=(rev*10)+mod;
            no=no/10;
        }
        System.out.println(rev);
        if(temp==rev)
        {
            System.out.println("palindrome");
        }
        else
        {
            System.out.println("not palin");
        }
    }
}