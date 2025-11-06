package practice;

public class FactRec
{
    static int fact=1;
    public static void fact(int num)
    {
        //for(int i=1;i<=num)

        if(num>1)
        {
            fact=fact*num;
            fact(num-1);
        }

    }
    public static void main(String[] args)
    {
        int num=4;
        fact(num);
        System.out.println(fact);
    }
}

//public class FactRec {
//    public static int fact(int num) {
//        if (num == 0 || num == 1) {
//            return 1;
//        }
//        return num * fact(num - 1); // recursion
//    }
//
//    public static void main(String[] args) {
//        int num = 5;
//        int result = fact(num);
//        System.out.println("Factorial of " + num + " is: " + result);
//    }
//}