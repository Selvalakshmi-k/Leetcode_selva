class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,ArrayList<String>> m=new LinkedHashMap<>();
        for(int i=0;i<strs.length;i++){
            char[] arr=strs[i].toCharArray();
            Arrays.sort(arr);
            String key=new String(arr);
            ArrayList<String> list=m.getOrDefault(key,new ArrayList<>());
            list.add(strs[i]);
            m.put(key,list);
        }
        return new ArrayList<>(m.values());
    }
}