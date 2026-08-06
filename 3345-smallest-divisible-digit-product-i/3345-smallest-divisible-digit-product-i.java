class Solution {
    public static int pro(int n){
        int res=1;
        while(n!=0){
            int rem=n%10;
            res*=rem;
            n/=10;
        }
        return res;
    }
    public int smallestNumber(int n, int t) {
        int ori=n;
        while(n>=ori){
            int p=pro(n);
            if(p%t==0){
                return n;
            }
            n++;
        }
        return 0;
    }
}