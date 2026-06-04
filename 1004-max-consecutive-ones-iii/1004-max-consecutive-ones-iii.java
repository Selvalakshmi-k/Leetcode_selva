class Solution {
    public int longestOnes(int[] arr, int k) {
        int n=arr.length;
        int max=0;
        int rep=0;
        int ws=0;
        for(int we=0;we<arr.length;we++){
            if(arr[we]==0){
                rep++;
            }
            while(rep>k){
                if(arr[ws]==0){
                    rep--;
                }
                ws++;
            }
            max=Math.max(max,we-ws+1);
        }
        return max;
    }
}