class Solution {
    public boolean checkDivisibility(int n) {
        int ori=n;
        int dup=ori;
        int sum=0;
        int pro=1;
        while(n!=0){
            int rem=n%10;
            sum+=rem;
            n/=10;
        }
        while(dup!=0){
            int rem=dup%10;
            pro*=rem;
            dup/=10;
        }
        if(ori%(sum+pro)==0){
            return true;
        }
        return false;
    }
}