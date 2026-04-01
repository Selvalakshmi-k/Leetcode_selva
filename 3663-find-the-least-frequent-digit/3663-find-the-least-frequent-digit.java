class Solution {
    public int getLeastFrequentDigit(int n) {
        int[] f=new int[10];
        while(n!=0){
            int r=n%10;
            f[r]++;
            n/=10;
        }
        int min=Integer.MAX_VALUE;
        int res=-1;
        for(int i=0;i<10;i++){
            if(f[i]>0){
            if(f[i]<min){
                min=f[i];
                res=i;
            }else if(f[i]==res){
                res=Math.min(res,i);
            }
        }
        }
        return res;
    }
}