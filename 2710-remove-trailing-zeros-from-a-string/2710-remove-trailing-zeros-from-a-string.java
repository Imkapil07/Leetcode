class Solution {
    public String removeTrailingZeros(String num) {
       int n = num.length();
        while(num.charAt(n-1) == '0'){
            n--;
        } 
        return num.substring(0,n);
    }
}