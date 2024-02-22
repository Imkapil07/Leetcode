class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        int half = n / 2;
        int count = 0;
        int count1 = 0;
        String v = "aeiouAEIOU";
        for (int i = 0; i < n / 2; i++) {
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + half);

            if (v.indexOf(c1) != -1) {
                count++;
            }
            if (v.indexOf(c2) != -1) {
                count1++;
            }
        }
        return count == count1;
    }
}