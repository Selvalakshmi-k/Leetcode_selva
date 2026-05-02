class Solution {
    public int romanToInt(String s) {
        int c_v=0;
        int p_v=0;
        int res=0;
        for(int i=s.length()-1;i>=0;i--){
            char c=s.charAt(i);
            switch(c){
                case 'I':
                c_v=1;
                break;
                case 'V':
                c_v=5;
                break;
                case 'X':
                c_v=10;
                break;
                case 'L':
                c_v=50;
                break;
                case 'C':
                c_v=100;
                break;
                case 'D':
                c_v=500;
                break;
                case 'M':
                c_v=1000;
                break;

            }
            if(c_v<p_v){
                res-=c_v;
            }else{
                res=res+c_v;
            }
            p_v=c_v;
        }
        return res;
    }
}