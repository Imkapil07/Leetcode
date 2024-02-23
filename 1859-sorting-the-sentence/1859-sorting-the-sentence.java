class Solution {
    public String sortSentence(String s) {
      String[] words = s.split(" ");
        String[] sortedWords = new String[words.length];

        for (String word : words) {
            int length = word.length();
            int index = word.charAt(length - 1) - '0';
            sortedWords[index - 1] = word.substring(0, length - 1);
        }

        return String.join(" ", sortedWords);
    }
}