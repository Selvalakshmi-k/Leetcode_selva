class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res=new StringBuilder();
        int dep=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                if(dep>0){
                    res.append(c);
                }
                dep++;
            }else{
                dep--;
                if(dep>0){
                    res.append(c);
                }
            }
        }
        return res.toString();
    }
}