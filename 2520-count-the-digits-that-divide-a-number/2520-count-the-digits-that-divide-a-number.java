class Solution {
    public int countDigits(int n) {
        int c=0;
        int ori=n;
        while(n!=0){
            int r=n%10;
            if(ori%r==0){
                c++;
            }
            n/=10;
        }
        return c;
    }
}