class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int r=image.length;
        int c=image[0].length;
        int[][] res=new int[r][c];
        for(int i=0;i<r;i++){
            int index=0;
            for(int j=c-1;j>=0;j--){
                if(image[i][j]==0)
                res[i][index++]=1;
                else
                res[i][index++]=0;
            }
        }
        return res;
    }
}