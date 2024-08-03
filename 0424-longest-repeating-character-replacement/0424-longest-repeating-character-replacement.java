class Solution {
    public int characterReplacement(String s, int k) {
        int[] arr = new int[26];
        int left = 0, right = 0;
        int ans = 0;
        int maxOcc = 0;

        for (right = 0; right < s.length(); right++) {
            maxOcc = Math.max(maxOcc, ++arr[s.charAt(right) - 'A']);
            while (right - left + 1 - maxOcc > k) {
                arr[s.charAt(left) - 'A']--;
                left++;
            }
            ans = Math.max(ans, right - left + 1);
        }
        return ans;
    }
}
