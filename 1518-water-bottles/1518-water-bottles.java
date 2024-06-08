class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;  
        
        while(numBottles>=numExchange){
            int nB = numBottles / numExchange;
            int rB = numBottles % numExchange;
     
                ans = ans+nB;
            
            numBottles = nB+rB;
            
        }
        return ans;
    }
}