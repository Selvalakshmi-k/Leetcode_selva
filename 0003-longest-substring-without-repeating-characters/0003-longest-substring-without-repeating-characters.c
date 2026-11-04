int lengthOfLongestSubstring(char* s) {
    int l=0;
    int r=0;
    int f[128]={0};
    int max=0;
    while(r<strlen(s)){
        f[s[r]]++;
        while(f[s[r]]>1){
            f[s[l]]--;
            l++;
        }
        int len=(r-l)+1;
        max=len>max?len:max;
        r++;
    }
    return max;
}