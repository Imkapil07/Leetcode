class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        PriorityQueue<Map.Entry<Integer,Integer>> heap = new PriorityQueue<>( 
        (a,b) -> b.getValue() - a.getValue()
        ); 
        heap.addAll(map.entrySet());
        
        int[] arr = new int[k];
        for(int i=0;i<k;i++){
            arr[i] = heap.poll().getKey();
        }
        return arr;
    }
}