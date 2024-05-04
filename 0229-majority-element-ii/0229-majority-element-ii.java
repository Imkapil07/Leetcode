class Solution {
    public List<Integer> majorityElement(int[] nums) {
       List<Integer> l = new ArrayList<>();  
       Map<Integer,Integer> map = new HashMap<>(); 
        int n = nums.length;
        
        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(nums[i])){
                map.put(nums[i],1);
            }else{
                int t = map.get(nums[i]);
                map.put(nums[i],t+1);
            }
        }
        int m = n/3;
        for(int a : map.keySet()){
            if(map.get(a)>m){
                l.add(a);
            }
        }
        return l;  
    }
}