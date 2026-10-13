import java.util.Arrays; // Needed to print the array

public class zero_to_end {
    public static void main(String[] args) {
        int index = 0;
        int[] ar = {0, 3, 5, 0, 2, 4, 0, 1};


        for (int i = 0; i < ar.length; i++) {
            if (ar[i] != 0) {
                ar[index] = ar[i];
                index++;
            }
        }

        while (index < ar.length) {
            ar[index] = 0;
            index++;
        }


        System.out.println(Arrays.toString(ar));
    }
}
