class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int gp=0;
        int sp=0;
        int c=0;
        while(sp<s.length && gp<g.length){
            // if(s[sp]>=g[gp]){
            //     c++;
            //     sp++;
            //     gp++;
            // }else{
            //     sp++;
            // }
            if(s[sp]>=g[gp]){
                gp++;
            }
            sp++;
        }
        return gp;
    }
}