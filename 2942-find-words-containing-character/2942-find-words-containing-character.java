class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> ar = new ArrayList<>();
        int n = words.length;
        for(int i=0;i<n;i++){
            if(words[i].contains(""+x)) ar.add(i);
        }
        return ar;
    }
}