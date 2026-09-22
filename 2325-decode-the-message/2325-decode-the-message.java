class Solution {
    public String decodeMessage(String key, String message) {
        Map<Character,Character> m=new HashMap<>();
        int i=97;
        for(char c:key.toCharArray()){
            if(m.containsKey(c) || c==' '){
                continue;
            }else{
                char letter=(char)i++;
                m.put(c,letter);
            }
        }
        String ans="";
        for(char ch:message.toCharArray()){
            if(ch==' '){
                ans+=' ';
                continue;
            }
            ans+=m.get(ch);
        }
        return ans;
    }
}