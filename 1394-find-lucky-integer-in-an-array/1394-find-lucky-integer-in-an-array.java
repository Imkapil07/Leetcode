class Solution {
    public int findLucky(int[] arr) {
        
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                 map.put(arr[i],1);
            }
        } 
        
        int x = 0;
        int max = -1;
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(m.getKey() == m.getValue()){
                 x = m.getValue();
                max = Math.max(max,x);
            }
        }
        return max;
    }
}