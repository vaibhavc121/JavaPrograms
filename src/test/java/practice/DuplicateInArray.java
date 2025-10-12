package practice;

public class DuplicateInArray
{
    public static void main(String[] args)
    {
        int[] nos={1,2,1,3,3,4,5,5};
        int counter=0;

        for(int i=0;i<nos.length-1;i++)
        {
            for(int j=i+1;j<nos.length;j++)
            {
                if(nos[i]==nos[j])
                {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}