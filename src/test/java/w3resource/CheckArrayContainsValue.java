package w3resource;

public class CheckArrayContainsValue
{


    static boolean isNumPresent()
    {
        int no = 121;
        int[] arr = {1, 2, 3, 121, 4};

        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == no)
            {
                return true;
            }

        }
        return false;
    }
    public static void main(String[] args)
    {
        System.out.println(isNumPresent());
    }
}