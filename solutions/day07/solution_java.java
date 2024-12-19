class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        st.push(s.charAt(0));
        
        for(int i = 1; i < s.length(); i++){
            Character curr = s.charAt(i);
            
            if(st.empty()){
                st.push(curr);
                continue;
            }
            Character top = st.peek();
           
            if(top == 'A' && curr == 'B'){
                st.pop();
            }
            else if(top == 'C' && curr == 'D'){
                st.pop();
            }
            else{
                st.push(curr);
            }
        }
       
        return st.size();
    }
}
