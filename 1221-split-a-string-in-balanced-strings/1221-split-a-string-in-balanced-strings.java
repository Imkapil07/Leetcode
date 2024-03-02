class Solution {
    public int balancedStringSplit(String s) {
        int count = 0;
        int Lcount = 0;
        int Rcount = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == 'R'){
                Rcount++;
            }else{
                Lcount++;
            } 
            if(Rcount == Lcount){
                count++;
            }
        } 
        return count;
    }
}