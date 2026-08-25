class Solution {
    public int missingMultiple(int[] nums, int k) {
        int dup=0;
        while(true){
            dup+=k;
            boolean found=false;
            for(int j=0;j<nums.length;j++){
                if(dup==nums[j]){
                    found=true;
                }
            }
            if(!found){
                return dup;
            }
        }
    }
}