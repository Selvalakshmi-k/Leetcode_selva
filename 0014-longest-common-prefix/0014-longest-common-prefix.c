char* longestCommonPrefix(char** strs, int strsSize) {
    if(strsSize == 0){
        char * res=malloc(1);
        res[0]='\0';
        return res;
    }
    int i=0;
    while(strs[0][i]!='\0'){
        for(int j=1;j<strsSize;j++){
            if((strs[j][i]!=strs[0][i])||(strs[j][i]=='\0')){
                char *res=malloc(i+1);
                res=strncpy(res,strs[0],i);
                res[i]='\0';
                return res;
            }
        }
        i++;
    }
    char *res=malloc(i+1);
    res=strncpy(res,strs[0],i);
    res[i]='\0';
    return res;
}