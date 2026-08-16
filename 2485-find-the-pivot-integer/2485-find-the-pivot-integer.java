class Solution {
    public int pivotInteger(int n) {
        for(int x=1;x<=n;x++){
            int l=0;
            int r=0;
            for(int i=1;i<=x;i++){
                l+=i;
            }
            for(int i=x;i<=n;i++){
                r+=i;
            }
            if(l==r){
                return x;
            }
        }
        return -1;
    }
}