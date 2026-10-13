import java.util.Arrays;

public class reverse_array
{
    void main()
    {
        int []ar={1,2,3,4,5};

        int i=0;
        int j=ar.length-1;
        int temp;

        while (i<j)
        {
            temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;

            i++;
        j--;

        }

        System.out.println(Arrays.toString(ar));
    }
}
