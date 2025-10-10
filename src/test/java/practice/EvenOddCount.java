package practice;

public class EvenOddCount
{
    public static void main(String[] args)
    {
        int evncounter=0;
        int oddcounter=0;
        for(int i=1;i<=10;i++)
        {
            if(i%2==0)
            {
                evncounter++;
            }
            else
            {
                oddcounter++;
            }
        }
        System.out.println("evn nos: "+evncounter);
        System.out.println("odd nos: "+oddcounter);
    }
}