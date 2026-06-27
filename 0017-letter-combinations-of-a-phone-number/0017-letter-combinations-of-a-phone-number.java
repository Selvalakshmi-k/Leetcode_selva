class Solution {
    List<String> res=new ArrayList<>();
    Map<Character,String> m=new HashMap<>();
    public List<String> letterCombinations(String digits) {
        
        m.put('2',"abc");
        m.put('3',"def");
        m.put('4',"ghi");
        m.put('5',"jkl");
        m.put('6',"mno");
        m.put('7',"pqrs");
        m.put('8',"tuv");
        m.put('9',"wxyz");

        backtrack(digits,0,new StringBuilder());
        return res;

    }
    public void backtrack(String digit,int index,StringBuilder current){
        if(index==digit.length()){
            res.add(current.toString());
            return;
        }
        String letter=m.get(digit.charAt(index));
        for(int i=0;i<letter.length();i++){
            current.append(letter.charAt(i));
            backtrack(digit,index+1,current);
            current.deleteCharAt(current.length()-1);
        }
    }
}