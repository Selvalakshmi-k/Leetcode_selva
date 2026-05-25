class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());
        for(int num:stones){
            q.offer(num);
        }
        while(q.size()>1){
            int y=q.poll();
            int x=q.poll();
            if(y!=x){
                q.offer(y-x);
            }
        }
        if(q.isEmpty())
        return 0;
        return q.peek();

    }
}