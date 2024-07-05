import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        
        List<Integer> a = new ArrayList<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] < 0) {
                a.add(Math.abs(nums[i]));
            } else {
                nums[index] = -nums[index];
            }
        }
        for (int i = 0; i < n; i++) {
            nums[i] = Math.abs(nums[i]);
        }
        return a;
    }
}
