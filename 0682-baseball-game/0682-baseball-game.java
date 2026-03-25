class Solution {
    public int calPoints(String[] op) {
        Stack<Integer> st=new Stack<>();
        int dummy=0;
        for(String val:op){
            if(val.equals("D")||val.equals("+")||val.equals("C")){
                String t=val;
                switch(t){
                    case "C":
                    st.pop();
                    break;
                    case "D":
                    st.push(st.peek()*2);
                    break;
                    case "+":
                    int a=st.pop();
                    int b=st.peek();
                    st.push(a);
                    st.push(a+b);
                    break;
                    default:
                }
            }else{
                st.push(Integer.parseInt(val));
            }
        }
        int sum=0;
        for(int val:st){
            sum+=val;
        }
        return sum;
    }
}