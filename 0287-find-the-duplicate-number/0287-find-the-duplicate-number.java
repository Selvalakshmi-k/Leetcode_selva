class Solution {
    public int findDuplicate(int[] nums) {
        int n=nums.length;
        int[] f=new int[n+1];
        for(int i=0;i<n;i++){
            int t=nums[i];
            f[t]++;
        }
        int ans=0;
        for(int i=0;i<n+1;i++){
            if(f[i]>1)
            ans=i;
        }
        return ans;
    }
}