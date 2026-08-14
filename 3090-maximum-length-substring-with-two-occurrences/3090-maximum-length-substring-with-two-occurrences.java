class Solution {
    public int maximumLengthSubstring(String s) {
        int max=Integer.MIN_VALUE;
        int[] f=new int[26];
        int left=0;
        for(int right=0;right<s.length();right++){
            f[s.charAt(right)-'a']++;
            while(f[s.charAt(right)-'a']>2){
                f[s.charAt(left)-'a']--;
                left++;
            }
            max=Math.max(max,right-left+1);
        }
        return max;
    }
}