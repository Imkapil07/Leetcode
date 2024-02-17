class Solution {
    public boolean checkIfPangram(String sentence) {
      char c ='a';
        for(int i=0;i<26;i++){
            if(sentence.contains(String.valueOf(c))){
             c++;
            }else return false;
        }
        return true;
    }
}