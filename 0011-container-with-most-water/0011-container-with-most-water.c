int maxArea(int* height, int heightSize) {
    int l=0;
    int r=heightSize-1;
    int ans=0;
    while(l<r){
        int w=r-l;
        int h=(height[l]<height[r])?height[l]:height[r];
        int water=h*w;
        ans=(water>ans)?water:ans;
        if(height[l]<height[r]){
            l++;
        }else{
            r--;
        }
    }
    return ans;
}