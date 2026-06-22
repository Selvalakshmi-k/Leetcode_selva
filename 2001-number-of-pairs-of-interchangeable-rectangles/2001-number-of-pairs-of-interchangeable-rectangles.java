class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        Map<Double,Integer> m= new HashMap<>();
        long count=0;
        for(int i=0;i<rectangles.length;i++){
            int[] temp=rectangles[i];
            int w=temp[0];
            int h=temp[1];
            double ratio=(double)w/h;
            m.put(ratio,m.getOrDefault(ratio,0)+1);
        }
        for(int val:m.values()){
            if(val>0){
                count+=(long)val*(val-1)/2;
            }
        }
        return count;
    }
}