class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        for(int i=0;i<k;i++){
            int d=0;
            int min=Integer.MAX_VALUE;
            for(int j=0;j<nums.length;j++){
                if(nums[j]<min){
                    min=nums[j];
                    d=j;
                }
            }
            nums[d]=nums[d]*multiplier;
        }
        return nums;
    }
}