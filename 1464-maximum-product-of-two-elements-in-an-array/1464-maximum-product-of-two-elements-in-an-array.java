class Solution {
    public int maxProduct(int[] nums) {
        int max=0;
        int secMax=0;
        
        for(int num : nums){
            if(num>max){
                secMax = max;
                max = num;
                continue;
            }
            if(num>secMax){
                secMax = num;
            }
        }
        return (max-1)*(secMax-1);
    }
}