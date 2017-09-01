public class TwelveInts
{
    public static void main(String args[])
    {
        int[] numbers = {10,13,17,45,72,89,97,98,99,100,102,111};
        int i;
        for (i = 0; i < numbers.length; i++)
            System.out.print(numbers[i] + " ");
        System.out.println();
        for (i = numbers.length - 1; i >=0; i--)
            System.out.print("" + numbers[i] + " ");
        System.out.println();
    }
}
