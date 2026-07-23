class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder repeated=new StringBuilder();
        int c=0;
        while(repeated.length()<b.length()){
            repeated.append(a);
            c++;
        }
        if(repeated.indexOf(b)!=-1){
            return c;
        }
        repeated.append(a);
        c++;
        if(repeated.indexOf(b)!=-1){
            return c;
        }
        return -1;
    }
}