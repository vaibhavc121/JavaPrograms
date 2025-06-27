package w3resource;

public class SumNumbersString
{
    public static void main(String[] args)
    {
        String str="it 15 is25 a 20string";
        String[] arr = str.split(" ");

        int sum = 0;
        for (String s : arr) {
            try {
                sum += Integer.parseInt(s);
            } catch (NumberFormatException e) {
                // Ignore non-integer strings
            }
        }
        System.out.println("Sum of numbers in the string: " + sum);


    }
}