class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int maxfreq=0;
        int maxlen=0;
        int[] f=new int[2];
        for(int r=0;r<nums.length;r++){
            f[nums[r]]++;
            maxfreq=Math.max(maxfreq,f[1]);
            while((r-l+1)-maxfreq>k){
                f[nums[l]]--;
                l++;
            }
            maxlen=Math.max(maxlen,(r-l+1));
        }
        return maxlen;
    }
}