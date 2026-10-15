import java.util.Arrays;

public class code
{
    public static void main(String[] args)
    {
        int[] array = {2, 4, 6, 8, 9, 7};
        int k = 3;

        Arrays.sort(array);
        int count = Math.min(k, array.length);
        for (int i = array.length - 1; i >= array.length - count; i--)
        {
            System.out.println(array[i]);
        }
    }
}