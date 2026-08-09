class Solution {
    public static boolean dfs(char[][] board,int i,int j,String word,int index){
        if(i<0||j<0||i==board.length||j==board[0].length||board[i][j]!=word.charAt(index))
        return false;
        if (index == word.length() - 1) 
        return true;
        char t=board[i][j];
        board[i][j]='#';
        boolean found=dfs(board, i + 1, j,word,index+1)|| // down
        dfs(board, i - 1, j,word,index+1)|| // up
        dfs(board, i, j + 1,word,index+1)|| // right
        dfs(board, i, j - 1,word,index+1); //left
        board[i][j]=t;
        return found;
    }
    public boolean exist(char[][] board, String word) {
        String res="";
        
        char[] a=word.toCharArray();
        int idx=0;
        int r=board.length;
        int c=board[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board,i,j,word,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}