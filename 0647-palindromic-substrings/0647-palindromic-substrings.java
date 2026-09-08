class Solution {
    public static boolean ispalin(String d){
        String temp=d;
        int start=0;
        int end=d.length()-1;
        char[] ch=d.toCharArray();
        while(start<end){
            char t=ch[start];
            ch[start]=ch[end];
            ch[end]=t;
            start++;
            end--;
        }
        String st=new String(ch);
        if(st.equals(d)){
            return true;
        }
        return false;
    }
    public int countSubstrings(String s) {
        int c=0;
        for(int i=0;i<s.length();i++){
            String d="";
            for(int j=i;j<s.length();j++){
                d+=s.charAt(j);
                if(ispalin(d)){
                    c++;
                }
            }
        }
        return c;
    }
}