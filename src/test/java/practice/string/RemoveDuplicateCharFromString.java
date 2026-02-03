package practice.string;

public class RemoveDuplicateCharFromString
{
    public static void main(String[] args)
    {
        String str="vaibhav";
        char[] ch=str.toCharArray();

        for(int i=0;i<ch.length-1;i++)
        {
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[i]==ch[j])
                {
                    ch[i]=' ';
                }
            }
        }

        for(int i=0;i<ch.length;i++)
        {
            if(!(ch[i]==' '))
            {
                System.out.print(ch[i]+" ");
            }
        }

    }
}