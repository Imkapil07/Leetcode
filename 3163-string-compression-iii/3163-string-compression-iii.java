class Solution {
    public String compressedString(String word) {
        int len = word.length();
        int idx = 0;
        StringBuilder sb = new StringBuilder();
        
        while(idx < len){
            
            char c = word.charAt(idx);
            int count = 0;
            
            while(idx < len && word.charAt(idx) == c){
                count++;
                idx++;
            }
            while(count > 9) {
                sb.append(9);
                sb.append(c);
                count -= 9;
            }
            
            sb.append(count);
            sb.append(c);
        }
      return sb.toString();
    }
}