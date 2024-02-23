class Solution {
    public String reverseWords(String s) {
        String[] arr = s.split(" "); 
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<arr.length;i++){ 
            StringBuilder a = new StringBuilder(arr[i]);
            a.reverse();
            sb.append(a); 
            sb.append(" ");
        } 
        return sb.toString().trim();
    }
}