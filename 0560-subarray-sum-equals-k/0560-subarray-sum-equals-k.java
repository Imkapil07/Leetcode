class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int preSum = 0;
        Map<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        
        for(int i=0;i<n;i++){
           preSum += nums[i];
            count += map.getOrDefault(preSum-k,0);
            map.put(preSum,map.getOrDefault(preSum,0)+1);
        }
        return count;
    }
}