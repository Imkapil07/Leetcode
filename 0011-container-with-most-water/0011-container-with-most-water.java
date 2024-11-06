class Solution {
   public int maxArea(int[] height) {
    int maxWater = 0;
       int l = 0;
       int r = height.length-1;
       
       while(l < r){
           int h = Math.min(height[l],height[r]);
           int d = r - l;
           int area = h * d;
           
           maxWater = Math.max(area,maxWater);
           
           if(height[l] < height[r]){
               l++;
           }else{
               r--;
           }
       }
       return maxWater;
    }

}