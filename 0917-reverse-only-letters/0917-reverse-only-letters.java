class Solution {
    public String reverseOnlyLetters(String s) {
        
        int start = 0;
        int end = s.length()-1;
        char[] c = s.toCharArray();
        while(start <= end){
            int mid = (start+end)/2; 
            if(!Character.isLetter(c[start])){
                start++;
            }else if(!Character.isLetter(c[end])){
                end--;
            }else{
               char temp = c[start];
                c[start] = c[end];
                c[end] = temp;
                start++;
                end--;
            }
        }
        return new String(c);
    }
}