class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] ans=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int n_g=-1;
            boolean found = false;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j]>nums[i]){
                    n_g=nums[j];
                    found=true;
                    break;
                }
            }
            if(!found){
                for(int j=0;j<i;j++){
                    if(nums[j]>nums[i]){
                        n_g=nums[j];
                        break;
                    }
                }
            }
            ans[i]=n_g;
        }
        return ans;
    }
}