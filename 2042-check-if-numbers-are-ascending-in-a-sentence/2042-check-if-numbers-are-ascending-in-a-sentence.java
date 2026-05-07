class Solution {
    public boolean areNumbersAscending(String s) {
        String[] arr=s.split(" ");
        List<Integer> temp=new ArrayList<>();
        for(String st:arr){
            String t="";
            for(int i=0;i<st.length();i++){
                char c=st.charAt(i);
                if(Character.isDigit(c)){
                    t=t+c;
                }else{
                    break;
                }
            }
            if(t.equals("")){
            continue;
            }
            else{
            int con=Integer.parseInt(t);
            temp.add(con);
            }
        }
        int[] res=new int[temp.size()];
        int i=0;
        for(int num:temp){
            res[i]=num;
            if(i>0 && (res[i]<=res[i-1])){
                return false;
            }
            i++;
        }
        return true;
    }
}