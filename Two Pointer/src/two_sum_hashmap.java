import java.util.HashMap;

class two_sum_hashmap {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                return new int[] { map.get(complement), i };
            }
            map.put(nums[i], i);
        }
        return new int[] {};
    }


    void main()
    {
        int[] num = {1, 2, 3, 5, 7, 9};
        int tar = 9;
        twoSum(num,tar);
    }
}
