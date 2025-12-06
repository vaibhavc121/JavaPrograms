package practice.string;

public class OccOfChar
{
    public static void main(String[] args)
    {
        String s="vaibhav";
        int counter=0;
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='i')
            {
                counter++;
            }
        }
        System.out.println(counter);

//        String s="vaibhav vaibhav chavan";
//        int counter=0;
//        String[] ch=s.split(" ");
//
//        for(int i=0;i<ch.length;i++)
//        {
//            if(ch[i].equals("vaibhav"))
//            {
//                counter++;
//            }
//        }
//        System.out.println(counter);
    }
}