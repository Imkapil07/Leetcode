class Solution {
    public boolean checkRecord(String s) {
        int absentCount = 0;
        int lateStreak = 0;

        for (char status : s.toCharArray()) {
            if (status == 'A') {
                absentCount++;
                lateStreak = 0;
            } else if (status == 'L') {
                lateStreak++;
            } else {
                lateStreak = 0; 
            }
            if (absentCount >= 2 || lateStreak >= 3) {
                return false;
            }
        }
        return true;  
    }
}