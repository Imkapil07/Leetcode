class Solution {
    public int firstMissingPositive(int[] nums) {
        int size = nums.length;
        Arrays.sort(nums, 0, size);
        int minMissing = 1;
        for (int i = 0; i < size; i++) {
            if (nums[i] > 0 && nums[i] == minMissing) {
                minMissing++;
            }
        }

        return minMissing;
    }
}