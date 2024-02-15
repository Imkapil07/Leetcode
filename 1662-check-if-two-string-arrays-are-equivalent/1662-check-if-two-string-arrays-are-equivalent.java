class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        boolean a = false;
        
        for(int i=0;i<word1.length;i++){
            for(int j=0;j<word2.length;j++){
                if(String.join("",word1).equals(String.join("",word2))){
                    a=true;
                    break;
                }else{
                    a=false;
                    break;
                }
            }
        }
        return a;
    }
}