class Solution {
    public long sumAndMultiply(int n) {
        long sum=0;
        long temp=0;
        StringBuilder s=new StringBuilder();
        while(n>0){
            long rem=n%10;
            if(rem!=0){
                s.append(rem);
                sum+=rem;
            }
            n/=10;
        }
        s.reverse();
        String st=s.toString();
        if(st.length()==0){
            return 0;
        }
        long t=Long.parseLong(st);
        return t*sum;
    }
}