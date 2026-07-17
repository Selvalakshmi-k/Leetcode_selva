class Solution {
    public boolean checkInclusion(String s1, String s2) {
        List<Integer> l=new ArrayList<>();
        int[] f1=new int[26];
        int[] f2=new int[26];
        for(char c:s1.toCharArray()){
            f1[c-'a']++;
        }
        int ws=0;
        for(int we=0;we<s2.length();we++){
            f2[s2.charAt(we)-'a']++;
            while(we-ws+1>s1.length()){
                f2[s2.charAt(ws)-'a']--;
                ws++;
            }
            if(we-ws+1==s1.length()){
                if(issame(f1,f2)){
                    l.add(ws);
                }
            }
            
        }
        if(l.isEmpty()){
                return false;
            }
            return true;
    }
    public static boolean issame(int[] a,int[] b){
        for(int i=0;i<26;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }
        return true;
    }
}