class Solution {
    public int differenceOfSum(int[] nums) {
        int n = nums.length; 
        int elSum = 0;
        int digSum = 0;
        for(int i=0;i<n;i++){
            elSum+=nums[i];
            int v = nums[i];
            int rem;
            while(v>0){
                rem = v % 10;
                digSum+=rem;
                v = v/10;
            }
        } 
        return Math.abs(elSum - digSum);
    }
}