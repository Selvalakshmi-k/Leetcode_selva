class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] res=new int[nums.length*2];
        int index=0;
        int index2=nums.length;
        for(int i=0;i<nums.length;i++){
            res[index++]=nums[i];
            res[index2++]=nums[nums.length-i-1];
        }
        return res;
    }
}