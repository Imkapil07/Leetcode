class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if(s.length() == 0 || s == null) return 0;
        
        int ss=0;
        int e=0; 
        int max=0;
        
        List<Character> arr = new ArrayList<>();
        while(e<s.length()){
            if(!arr.contains(s.charAt(e))){
                arr.add(s.charAt(e));
                e++;
                max = Math.max(max,arr.size());
            }else{
                arr.remove(Character.valueOf(s.charAt(ss)));
                ss++;
            }
        }
        return max;
    }
}