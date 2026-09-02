class Solution {
    public int firstMissingPositive(int[] nums) {
        int res=0;
        Set<Integer> s=new TreeSet<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                continue;
            }
            s.add(nums[i]);
        }
        int num=1;
        while(s.contains(num++)){

        }
        return num-1;
    }
}