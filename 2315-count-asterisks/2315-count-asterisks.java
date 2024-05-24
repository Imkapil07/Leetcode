class Solution {
    public int countAsterisks(String s) {
        int bar=0;
        int ast=0;
        for(char ch : s.toCharArray()){
            if(ch == '|') bar++;
            if(ch == '*' && bar % 2 == 0) ast++;
        }
        return ast;
    }
}