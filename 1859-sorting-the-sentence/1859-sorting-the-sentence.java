class Solution {
    public String sortSentence(String s) {
        String[] arr=s.split(" ");
        Arrays.sort(arr,(a,b)->{
            int num1=Character.getNumericValue(a.charAt(a.length()-1));
            int num2=Character.getNumericValue(b.charAt(b.length()-1));
            return num1-num2;
        });
        int index=0;
        for(String st:arr){
            arr[index]=st.replaceAll("[0-9]","");
            index++;
        }
        return String.join(" ",arr);
    }
}