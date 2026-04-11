class Solution {
    static boolean check(int[] nums){
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                return true;
            }
        }
        return false;
    }
    public int minimumOperations(int[] nums) {
        int op=0;
       while(check(nums)){
                int min=Integer.MAX_VALUE;
                for(int j=0;j<nums.length;j++){
                    if(nums[j]<min && nums[j]!=0){
                        min=nums[j];
                    }
                }
                for(int k=0;k<nums.length;k++){
                    if(nums[k]!=0){
                        nums[k]=nums[k]-min;
                    }
                }
            op++;
       }
        return op;

    }
}