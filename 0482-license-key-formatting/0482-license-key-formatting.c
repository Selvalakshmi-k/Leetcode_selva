char* licenseKeyFormatting(char* s, int k) {
    int n=strlen(s);
    int index=0;
    int count=0;
    char *res=malloc((2*(n+2))*sizeof(char));
    for(int i=n-1;i>=0;i--){
        if(s[i]=='-') continue;
        if(count==k){
            res[index++]='-';
            count=0;
        }
        res[index++]=toupper(s[i]);
        count++;
    }
    res[index]='\0';

    int l=0;
    int r=index-1;
    while(l<r){
        char t=res[l];
        res[l]=res[r];
        res[r]=t;
        l++;
        r--;
    }
    return res;
}