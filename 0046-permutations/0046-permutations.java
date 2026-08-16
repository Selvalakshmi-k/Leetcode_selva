class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        bt(nums,new ArrayList<>(),res);
        return res;
    }
    public static void bt(int[] nums, List<Integer> cur,List<List<Integer>> res){
        if(cur.size()==nums.length){
            res.add(new ArrayList<>(cur));
            return;
        }
        for(int num:nums){
            if(cur.contains(num)){
                continue;
            }
            cur.add(num);
            bt(nums,cur,res);
            cur.remove(cur.size()-1);
        }
    }
}