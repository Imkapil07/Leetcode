class Solution {
    public boolean isPrefixString(String s, String[] words) {
        
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<words.length;i++){
            sb.append(words[i]);
            String a = sb.toString();
            if(a.equals(s)){
                return true;
            }
        } 
        return false;
    }
}