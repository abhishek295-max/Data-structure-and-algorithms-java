public class linear_search
{
    public int linearSearch(int [] arr,int target)
    {
        int i;
        for (i=0;i< arr.length-1;i++)
        {
            if (arr[i]==target)
            {
                return arr[i];
            }
        }

        return -1;

    }

    void main()
    {
        int [] nums ={2,3,54,69,25,4,6};
        int target = 4;

        int result = linearSearch(nums,target);

        if (result!=-1)
        {
            System.out.println("element found");
        }
        else
        {
            System.out.println("element not found");
        }
    }
}
