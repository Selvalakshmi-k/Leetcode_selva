class Solution {
    public int maxFreqSum(String s) {
        int[] f=new int[26];
        for(int i=0;i<s.length();i++){
            f[s.charAt(i)-'a']++;
        }
        int v_m=0;
        int res=0;
        int c_c=0;
        for(int i=0;i<26;i++){
            if(i==0||i==4||i==8||i==14||i==20){
                v_m=Math.max(v_m,f[i]);
            }else{
                c_c=Math.max(c_c,f[i]);
            }
        }
        return v_m+c_c;
    }
}