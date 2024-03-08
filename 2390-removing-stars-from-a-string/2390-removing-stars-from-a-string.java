class Solution {
    public String removeStars(String s) {
        Stack<Character> stck = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(Character.isLetter(c)){
                stck.push(c);
            }else if(c == '*'){
                stck.pop();
            }
        } 
        while(!stck.isEmpty()){
            sb.append(stck.pop());
        }
        return sb.reverse().toString();
    }
}