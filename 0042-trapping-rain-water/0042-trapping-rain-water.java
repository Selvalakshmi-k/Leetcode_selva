class Solution {
    public int trap(int[] height) {
        if(height==null||height.length<3){
            return 0;
        }
        int leftmax=height[0];
        Stack<Integer> s=new Stack<>();
        s.push(height[height.length-1]);
        for(int i=height.length-2;i>=2;i--){
            s.push(Math.max(height[i],s.peek()));
        }
        int water=0;
        for(int i=1;i<height.length-1;i++){
            int minheight=Math.min(leftmax,s.pop());
            water=water+(Math.max(minheight-height[i],0));
            leftmax=Math.max(height[i],leftmax);
        }
        return water;
    }
}