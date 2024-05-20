class Solution {
    public int maxScore(String s) {
        int ans = 0;
        int left =0;// for 0's
        int right =0;//for 1's
        
        for(char c : s.toCharArray()){
            if(c == '1') right++;
        } 
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == '0') left++;
            else right--;
            
            ans = Math.max(ans,left+right);
        }
        return ans;
    }
}