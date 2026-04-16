class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=-1;
        int[] t=new int[26];
        for(int i=0;i<26;i++){
            t[i]=-1;
        }
        for(int i=0;i<s.length();i++){
            char d=s.charAt(i);
            if(t[d-'a']==-1){
                t[d-'a']=i;
            }else{
                int len=i-t[d-'a']-1;
                max=Math.max(max,len);
            }
        }
        return max;
    }
}