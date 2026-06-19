class Solution {
    public int largestAltitude(int[] gain) {
        int n=gain.length;
        int[] res=new int[n+1];
        res[0]=0;
        int sum=0;
        int index=1;
        int max=0;
        for(int i=0;i<n;i++){
            sum+=gain[i];
            res[index++]=sum;
            max=Math.max(sum,max);
        }
        return max;
    }
}