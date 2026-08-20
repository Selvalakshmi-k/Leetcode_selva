class Solution {
    public boolean divideArray(int[] nums) {
       Map<Integer,Integer> m=new HashMap<>();
       for(int i=0;i<nums.length;i++){
        m.put(nums[i],m.getOrDefault(nums[i],0)+1);
       } 
       for(int val:m.values()){
        if(val%2!=0){
            return false;
        }
       }
       return true;
    }
}