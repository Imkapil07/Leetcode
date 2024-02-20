class Solution {
    public String interpret(String command) {
        String s = command.replace("()","o");
        String s1 = s.replace("(al)","al");
        return s1;
    }
}