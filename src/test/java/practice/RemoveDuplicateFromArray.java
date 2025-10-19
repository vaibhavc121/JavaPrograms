package practice;

import java.util.Arrays;

public class RemoveDuplicateFromArray
{
    public static void main(String[] args)
    {
        int[] no={1,2,3,1,4,5,5};
        for(int i=0;i<no.length-1;i++)
        {
            for(int j=i+1;j<no.length-2;j++)
            {
                if(no[i]==no[j])
                {
                    no[j]=no[j+1];
                }
            }
        }

        System.out.println(Arrays.toString(no));
        //
    }

}