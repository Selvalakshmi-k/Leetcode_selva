class Solution {
    public int longestSubarray(int[] nums) {
        int ws=0;
        int rep=0;
        int max=0;
        for(int we=0;we<nums.length;we++){
            if(nums[we]==0){
                rep++;
            }
            while(rep>1){
                if(nums[ws]==0){
                    rep--;
                }
                ws++;
            }
            max=Math.max(max,(we-ws+1)-1);
        }
        return max;
    }
}