class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int ans=0;
        for(int key:m.keySet()){
            if(m.get(key)==2){
                ans^=key;
            }
        }
        return ans;
    }
}