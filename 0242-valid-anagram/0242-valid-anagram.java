class Solution {
    public boolean isAnagram(String s, String t) {
        char[] input1 =s.toCharArray();
        char[] input2 =t.toCharArray();
        Arrays.sort(input1);
        Arrays.sort(input2);
        if(s.length()!=t.length())
        return false;
        boolean flag=true;
        for(int i=0;i<input1.length;i++){
            if(input1[i]!=input2[i]){
            flag=false;
            break;
            }
        }
        if(flag==false)
        return false;
        else
        return true;
        
    }
}