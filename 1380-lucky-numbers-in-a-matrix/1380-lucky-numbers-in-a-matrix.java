class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int index=0;
            int min=matrix[i][0];
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]<min){
                    min=matrix[i][j];
                    index=j;
                }
            }
            boolean valid=true;
        for(int k=0;k<matrix.length;k++){
            if(matrix[k][index]>min){
                valid=false;
                break;
            }
        }
        if(valid)
        res.add(min);
        }
        // boolean valid=true;
        // for(int k=0;k<matrix.length;k++){
        //     if(matrix[k][index]>min){
        //         valid=false;
        //         break;
        //     }
        // }
        // if(valid)
        // res.add(min);
        return res;
    }
}