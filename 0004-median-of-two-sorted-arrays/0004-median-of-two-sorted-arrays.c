double findMedianSortedArrays(int* nums1, int nums1Size, int* nums2, int nums2Size) {
    double ans=0;
    int tot=nums1Size+nums2Size;
    int arr[tot];
    int idx=0;
    for(int i=0;i<nums1Size;i++){
        arr[idx++]=nums1[i];
    }
    for(int i=0;i<nums2Size;i++){
        arr[idx++]=nums2[i];
    }
    for(int i=0;i<tot-1;i++){
        for(int j=0;j<tot-i-1;j++){
            if(arr[j]>arr[j+1]){
            int temp=arr[j];
            arr[j]=arr[j+1];
            arr[j+1]=temp;
            }
        }
    }
    if(tot%2!=0){
        ans=arr[tot/2];
    }else{
        ans+=arr[tot/2];
        ans+=arr[(tot/2)-1];
        ans/=2;
    }
    return ans;
}