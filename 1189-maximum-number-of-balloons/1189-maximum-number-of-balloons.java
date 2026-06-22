class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq=new int[26];
        for(int i=0;i<text.length();i++){
            char c=text.charAt(i);
            if(c=='b'||c=='a'||c=='l'||c=='o'||c=='n'){
            freq[c-'a']++;
            }
        }
        int a_count=freq['a'-'a'];
        int b_count=freq['b'-'a'];
        int l_count=(int)Math.floor(freq['l'-'a']/2);
        int o_count=(int)Math.floor(freq['o'-'a']/2);
        int n_count=freq['n'-'a'];

        return Math.min(a_count,Math.min(b_count,Math.min(l_count,Math.min(o_count,n_count))));

    }
}