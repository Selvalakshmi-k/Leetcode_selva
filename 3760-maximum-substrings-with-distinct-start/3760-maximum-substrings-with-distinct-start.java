class Solution {
    public int maxDistinct(String s) {
        int[] arr=new int[26];
        for(char ch:s.toCharArray()){
            arr[ch-'a']++;
        }
        int c=0;
        for(int i=0;i<26;i++){
            if(arr[i]>0){
                c++;
            }
        }
        return c;
    }
}