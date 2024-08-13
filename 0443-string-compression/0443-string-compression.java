class Solution {
    public int compress(char[] chars) {
        int ans = 0;
        int idx = 0;
        int len = chars.length;
            
            while(idx < len){
                char ch = chars[idx];
                int count = 0;
                
                while(idx < len && chars[idx] == ch){
                    count++;
                    idx++;
                }
                
                chars[ans] = ch;
                ans++;
                
                if(count >= 2){
                    for(char x : String.valueOf(count).toCharArray()){
                        chars[ans] = x;
                        ans++;
                    }
                }
            }
        return ans;
    }
}