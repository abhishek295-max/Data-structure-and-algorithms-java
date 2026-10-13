
public class Two_Sum
{

    public static boolean pointer(int[] ar, int target) {
        int i = 0;
        int j = ar.length - 1;

        while (i < j) {
            int sum = ar[i] + ar[j];

            if (sum > target) {
                j--;
            } else if (sum < target) {
                i++;
            } else {
                System.out.println(ar[i] + " + " + ar[j] + " = " + target);
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 5, 7, 9};
        int tar = 9;

        pointer(num, tar);
    }
}
