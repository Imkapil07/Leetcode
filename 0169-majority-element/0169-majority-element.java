class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> h = new HashMap<>();
        
        for(int i=0;i<n;i++){
            int val = h.getOrDefault(nums[i],0);
            h.put(nums[i],val+1);
        }
        for(Map.Entry<Integer,Integer> it : h.entrySet()){
            if(it.getValue() > (n/2)){
                return it.getKey();
            }        
        }
        return -1;
    }
}