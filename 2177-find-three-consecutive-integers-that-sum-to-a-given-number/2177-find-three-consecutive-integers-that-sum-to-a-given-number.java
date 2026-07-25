class Solution {
    public long[] sumOfThree(long num) {
        long[] ans=new long[3];
        boolean flag=false;
        long n=(num/3)-1;
        long n1=n;
        long n2=n1+1;
        long n3=n2+1;
        long sum=n1+n2+n3;
        if(sum==num){
            ans[0]=n1;
            ans[1]=n2;
            ans[2]=n3;
            return ans;
        }
        return new long[0];
    }
}