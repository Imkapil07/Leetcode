class Solution {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        int n = columnTitle.length();

        for (int i = 0; i < n; i++) {
            char currentChar = columnTitle.charAt(i);
            int digitValue = currentChar - 'A' + 1; 
            result = result * 26 + digitValue; 
        }
     return result;
    }
}
