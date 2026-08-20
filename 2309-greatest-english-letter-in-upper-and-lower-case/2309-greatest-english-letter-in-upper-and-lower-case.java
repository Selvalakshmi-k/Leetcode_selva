class Solution {
    public String greatestLetter(String s) {
        boolean[] l=new boolean[26];
        boolean[] u=new boolean[26];
        String res="";
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLowerCase(c)){
                l[s.charAt(i)-'a']=true;
            }else{
                u[s.charAt(i)-'A']=true;
            }
        }
        for(int i=25;i>=0;i--){
            if(l[i]&&u[i]){
                res+=(char)(i+'A');
                return res;
            }
        }
        return res;
    }
}