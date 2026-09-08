class Solution {
    public int countCommas(int n) {
        int c=0;
        for(int i=1000;i<=n;i++){
            if(n>=1000){
                c++;
            }
        }
        return c;
    }
}