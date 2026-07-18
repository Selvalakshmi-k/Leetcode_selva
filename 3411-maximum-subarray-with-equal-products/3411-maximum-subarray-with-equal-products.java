class Solution {
    public int maxLength(int[] nums) {
        int max=0;
        for(int i=0;i<nums.length;i++){
            int p=1;
            int g_c=0;
            int lcm=1;
            for(int j=i;j<nums.length;j++){
                p=p*nums[j];
                g_c=gcd(g_c,nums[j]);
                lcm=(lcm/gcd(lcm,nums[j]))*nums[j];
                if(p==g_c*lcm){
                    max=Math.max(max,j-i+1);
                }
                
            }
        }
        return max;
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}