class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        int[] t = new int[n];
        ArrayList<Integer> l = new ArrayList<>();
        for(int i=0;i<n;i++){
            l.add(index[i],nums[i]);
        }
        for(int i=0;i<l.size();i++){
            t[i] = l.get(i);
        }
        return t;
    }
}