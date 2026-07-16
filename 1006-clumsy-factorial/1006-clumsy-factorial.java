class Solution {
    public int clumsy(int n) {
        if(n==1){
            return 1;
        }
       return solve(n-1,1,0,n); 
    }
    public static int solve(int n,int op,int ans,int last){
        if(n==0)
        return ans+last;
        
        if(op==1){
            last=last*n;
        }else if(op==2){
            last=last/n;
        }else if(op==3){
            ans+=last;
            last=n;
        }else{
            ans+=last;
            last=-n;
        }
        op++;
        if(op==5){
            op=1;
        }
        return solve(n-1,op,ans,last);
    }
}