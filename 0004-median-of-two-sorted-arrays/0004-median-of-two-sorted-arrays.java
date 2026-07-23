class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n=nums1.length;
        int m=nums2.length;
        int[] temp=new int[m+n];
        int idx=0;
        for(int i=0;i<nums1.length;i++){
            temp[idx++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            temp[idx++]=nums2[i];
        }
        Arrays.sort(temp);
        int total=temp.length;
        double ans;
        double sum=0;
        if(total%2!=0){
            ans=temp[total/2];
        }else{
            sum+=temp[total/2];
            sum+=temp[(total/2)-1];
            ans=sum/2;
        }
        return ans;
    }
}