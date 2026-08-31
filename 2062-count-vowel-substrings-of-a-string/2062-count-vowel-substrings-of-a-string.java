class Solution {
    public int countVowelSubstrings(String word) {
        int c=0;
        for(int i=0;i<word.length();i++){
            Set<Character> s=new HashSet<>();
            for(int j=i;j<word.length();j++){
                char ch=word.charAt(j);
                if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u'){
                    break;
                    }
                s.add(ch);
                if(s.size()==5){
                    c++;
                }
            }
        }
        return c;
    }
}