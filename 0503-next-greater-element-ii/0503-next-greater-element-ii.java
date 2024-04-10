class Solution {
    public int[] nextGreaterElements(int[] nums) {
      Stack<Integer> stack = new Stack<>();
        int[] nxtG = new int[nums.length];
        for (int i = 2 * nums.length - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= nums[i % nums.length]){
                stack.pop();
            }
            if(i < nums.length){
                if(!stack.isEmpty()){
                    nxtG[i] = stack.peek();
                }else {
                    nxtG[i] = -1;
                }
            }
            stack.push(nums[i % nums.length]);
        }
        return nxtG;
    }
}