class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int c=0;
        // for(int i=0;i<nums.length;i++){
        //     int product=1;
        //     for(int j=i;j<nums.length;j++){
        //         product=product*nums[j];
        //         if(product<k)
        //         c++;
        //         else
        //         break;
        //     }
        // }
        // return c;
        int ws=0;
        int pro=1;
        if(k<=1) return 0;
        for(int we=0;we<nums.length;we++){
            pro*=nums[we];
            while(pro>=k){
                pro/=nums[ws];
                ws++;
            }
            c+=we-ws+1;
        }
        return c;
    }
}