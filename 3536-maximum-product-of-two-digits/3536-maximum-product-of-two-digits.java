class Solution {
    public int maxProduct(int n) {
        String s=String.valueOf(n);
        int res=0;
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
            char ch=s.charAt(i);
            char ch2=s.charAt(j);
            int n1=ch-'0';
            int n2=ch2-'0';
            int pro=n1*n2;
            res=Math.max(res,pro);
        }
        }
        return res;
    }
}