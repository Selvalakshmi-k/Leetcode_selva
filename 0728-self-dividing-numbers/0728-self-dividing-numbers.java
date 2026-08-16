class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans=new ArrayList<>();
        for(int i=left;i<=right;i++){
            if(isself(i)){
                ans.add(i);
            }
        }
        return ans;
    }
    public static boolean isself(int n){
        int ori=n;
        while(n!=0){
            int rem=n%10;
            if(rem==0){
                return false;
            }
            if(ori%rem!=0){
                return false;
            }
            n/=10;
        }
        return true;
    }
}