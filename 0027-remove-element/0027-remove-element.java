class Solution {
    public int removeElement(int[] nums, int val) {
    ArrayList<Integer> al=new ArrayList<>();
    int k=0;
    for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
             al.add(nums[i]);
           }
       }
         for (Integer i : al) {
            nums[k++] = i;
        }
     return al.size(); 
    }
}

 
