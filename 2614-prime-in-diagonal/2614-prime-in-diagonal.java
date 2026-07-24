class Solution {
    public int diagonalPrime(int[][] nums) {
        int r=nums.length;
        int c=nums[0].length;
        int ans=0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(i==j||(i+j==r-1)){
                    if(isprime(nums[i][j])){
                        ans=Math.max(ans,nums[i][j]);
                    }
                }
            }
        }
        return ans;
    }
    public static boolean isprime(int val){
        if(val==1){
            return false;
        }
        if(val==2){
            return true;
        }
        for(int i=2;i*i<=val;i++){
            if(val%i==0){
                return false;
            }
        }
        return true;
    }
}