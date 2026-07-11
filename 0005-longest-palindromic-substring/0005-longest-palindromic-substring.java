class Solution {
    public String longestPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            sb.append("#").append(c);
        }
        sb.append("#");
        String s1=sb.toString();
        int[] p=new int[s1.length()+1];
        int maxlen=0;
        int center=0;
        int start=0;
        for(int i=0;i<s1.length();i++){
            int l=i-1;
            int r=i+1;
            while(l>=0 && r<s1.length() && s1.charAt(l)==s1.charAt(r)){
                p[i]++;
                l--;
                r++;
            }
            if(p[i]>maxlen){
                maxlen=p[i];
                center=i;
            }
            start=(center-maxlen)/2;
        }
        
            return s.substring(start,start+maxlen);
    }
}