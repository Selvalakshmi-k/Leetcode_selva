class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            m.put(nums[i],m.getOrDefault(nums[i],0)+1);
        }
        int maxfreq=0;
        int ans=-1;
        for(int key:m.keySet()){
            if(key%2==0){
                int freq=m.get(key);
                if(freq>maxfreq){
                    maxfreq=freq;
                    ans=key;
                }else if(freq==maxfreq){
                    if(ans==-1||key<ans){
                        ans=key;
                    }
                }
            }
        }
        return ans;
    }
}