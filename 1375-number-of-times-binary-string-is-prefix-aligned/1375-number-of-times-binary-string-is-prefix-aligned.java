class Solution {
    public int numTimesAllBlue(int[] flips) {
        int count=0;
        boolean[] arr=new boolean[flips.length];
        int max=0;
        for(int i=0;i<flips.length;i++)
        {
            int n=flips[i];
            arr[n-1]=true;
            if(n>max)
            {
                max=n;
            }
            if(max==i+1)
            {           
                count++;
            }
        }

        return count;
    }
}