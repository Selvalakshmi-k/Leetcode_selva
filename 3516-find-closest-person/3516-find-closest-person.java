class Solution {
    public int findClosest(int x, int y, int z) {
        int res=0;
        int x_r=Math.abs(x-z);
        int y_r=Math.abs(y-z);
        if(x_r<y_r){
            return 1;
        }else if(y_r<x_r){
            return 2;
        }else{
        return 0;
    }
    }
}