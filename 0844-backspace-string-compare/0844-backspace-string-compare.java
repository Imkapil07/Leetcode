class Solution {
    public boolean backspaceCompare(String s, String t) {
       return check(s).equals(check(t));
    } 
    
    public String check(String a){
        Stack<Character>  st = new Stack<>();
        for(char c : a.toCharArray()){
            if(c == '#'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(c);
            }
        }
        return String.valueOf(st);
    }
}