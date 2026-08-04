class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        ArrayList<Integer> res=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]-nums[i]==1){
                continue;
            }
                int n=nums[i-1];
                while(n+1<nums[i]){
                    res.add(++n);
                }
            
        }
        return res;
    }
}