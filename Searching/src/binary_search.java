import java.util.Arrays;

public class binary_search
{
    public int binary(int [] arr,int target)
    {
        int left=0;
        int right= arr.length-1;

        while (left<=right)
        {
            int mid= left+(right-left)/2;

            if(arr[mid]==target)
            {
                return mid;
            }
            else if (arr[mid]>target)
            {
                right = mid-1;
            }
            else
            {
                left = mid+1;
            }
        }

        return -1;
    }

    public static void main(String[] args)
    {
        int [] nums={1,3,4,7,6,8,2};


        int target=8;
        binary_search obj = new binary_search();
        int result=obj.binary(nums,target);

        if (result!=-1)
        {
            System.out.println("element found at " + result);
        }
        else
        {
            System.out.println("element not found");
        }
    }
}

