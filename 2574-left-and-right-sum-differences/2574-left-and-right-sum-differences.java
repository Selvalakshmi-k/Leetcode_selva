class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans=new int[nums.length];
        int[] ls=new int[nums.length];
        int[] rs=new int[nums.length];
        ls[0]=0;
        rs[nums.length-1]=0;
        int sum=0;
        for(int i=1;i<nums.length;i++){
            sum+=nums[i-1];
            ls[i]=sum;
        }
        int sum2=0;
        for(int i=nums.length-2;i>=0;i--){
            sum2+=nums[i+1];
            rs[i]=sum2;
        }
        for(int i=0;i<ans.length;i++){
            ans[i]=Math.abs(ls[i]-rs[i]);
        }
        return ans;

    }
}