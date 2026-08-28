class Solution {
    public boolean checkDistances(String s, int[] distance) {
       int[] f=new int[26];
       for(int i=0;i<26;i++){
        f[i]=-1;
       }
       for(int i=0;i<s.length();i++){
        int idx=s.charAt(i)-'a';
        if(f[idx]==-1){
            f[idx]=i;
        }else{
            int actual_length=i-f[idx]-1;
            if(actual_length!=distance[idx]){
                return false;
            }
        }
       }
       return true;
    }
}