class Solution {
    public static int dig(int n){
        int sum=0;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int ele_sum=0;
        int dig_sum=0;
        for(int i=0;i<nums.length;i++){
            ele_sum+=nums[i];
            dig_sum+=dig(nums[i]);
        }
        return ele_sum-dig_sum;
    }
}