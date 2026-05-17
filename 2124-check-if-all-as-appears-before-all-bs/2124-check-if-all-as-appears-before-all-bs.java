class Solution {
    public boolean checkString(String s) {
        char[] arr=s.toCharArray();
        for(int i=0;i<arr.length;i++){
            char c=arr[i];
            if(c=='a' && i>0 && arr[i-1]!='a'){
                return false;
            }
        }
        return true;
    }
}