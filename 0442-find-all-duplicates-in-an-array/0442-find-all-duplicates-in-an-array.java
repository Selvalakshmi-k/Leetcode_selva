class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> res=new ArrayList<>();
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> entry:m.entrySet()){
            if(entry.getValue()==2){
                res.add(entry.getKey());
            }
        }
        return res;
    }
}