class Solution {
    public boolean canFinish(int courses, int[][] prerequisites) {
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<courses;i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[courses];
        for(int[] pre:prerequisites){
            int course=pre[0];
            int prerequisite=pre[1];
            adj.get(prerequisite).add(course);
            indegree[course]++;
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<courses;i++){
            if(indegree[i]==0){
                q.offer(i);
            }
        }
        int completed=0;
        while(!q.isEmpty()){
            int temp=q.poll();
            completed++;
            for(int neigh:adj.get(temp)){
                indegree[neigh]--;
                if(indegree[neigh]==0){
                    q.offer(neigh);
                }
            }
        }
        return completed==courses;
    }
}