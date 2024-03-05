class Solution {
    public int longestConsecutive(int[] nums) {
       HashSet<Integer> m = new HashSet<>();
       for(int num : nums) m.add(num);
       int maxStreak = 0;
        for(int num : m){
        if(!m.contains(num-1)){
            int curNum = num;
            int curStreak = 1;
            while(m.contains(curNum+1)){
                curStreak++;
                curNum++;
            }
            maxStreak = Math.max(maxStreak,curStreak);
          }
        }
        return maxStreak;
    }
}