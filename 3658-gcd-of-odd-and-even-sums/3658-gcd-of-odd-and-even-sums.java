class Solution {
    public int gcdOfOddEvenSums(int n) {
        n=n*2;
        int o_s=0;
        int e_s=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                e_s+=i;
            }else{
                o_s+=i;
            }
        }
         return gcd(o_s,e_s);
    }
    public static int gcd(int a,int b){
        if(b==0)
        return a;

        return gcd(b,a%b);
    }
}