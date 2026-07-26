class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        // int right_product=nums[n-3]*nums[n-2]*nums[n-1];
        // int left_product=nums[0]*nums[1]*nums[n-1];
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3],nums[n-1]*nums[0]*nums[1]);
    }
}

//1 2 3 4 5 => 3 x 4 x 5=60

//5-> n-1
//4-> n-2
//3-> n-3

//n-1 * 0 * 1 -> to handling with negative numbers