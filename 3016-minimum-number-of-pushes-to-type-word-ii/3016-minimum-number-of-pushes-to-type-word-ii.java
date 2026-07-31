class Solution {
    public int minimumPushes(String word) {
        Map<Character,Integer> m=new HashMap<>();
        for(int i=0;i<word.length();i++){
            m.put(word.charAt(i),m.getOrDefault(word.charAt(i),0)+1);
        }
        int ans=0;
        List<Integer> li=new ArrayList<>();
        for(int f:m.values()){
            li.add(f);
        } 
        Collections.sort(li,Collections.reverseOrder());
        for(int i=0;i<li.size();i++){
            ans+=li.get(i)*((i/8)+1);
        }
    
        return ans;
    }
}