class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==0){
            return 0;
        }
        if(nums.length==1){
            return 1;
        }
        int count=1;
        int max_count=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]-1==nums[i-1]){
                count++;
            }else if(nums[i]==nums[i-1]){
                continue;
            }else if(nums[i]-1!=nums[i-1]){
                count=1;
                continue;
            }
            max_count=Math.max(max_count,count);
        }
        return max_count;
    }
}