class Solution {
    public String reversePrefix(String word, char ch) {
     StringBuilder sb = new StringBuilder();
        int n = word.length();
        int k=0;
        for(int i=0;i<n;i++){
            if(word.charAt(i) == ch){
                k=i;
                break;
            }
        } 
        sb.append(word.substring(0,k+1)).reverse();
        sb.append(word.substring(k+1));
        return sb.toString();
    }
}