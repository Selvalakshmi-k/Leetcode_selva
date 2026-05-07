class Solution {
    public int myAtoi(String s) {
        String res="";
        int n=0;
        boolean started=false;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(!started && Character.isWhitespace(c)){
                continue;
            }else if(c=='-'|| c=='+'){
                if(started){
                    break;
                }
                res=res+c;
                started=true;
            }else if(Character.isDigit(c)){
                res=res+c;
                started=true;
            }else{
                break;
            }
        }
        if(res.equals("")||res.equals("-")||res.equals("+")){
            return 0;
        }
        int ans=0;
            try{
                ans=Integer.parseInt(res);
            }catch(NumberFormatException e){
                if(res.charAt(0)=='-')
                return Integer.MIN_VALUE;
                else
                return Integer.MAX_VALUE;
            }
            return ans;
    }
}