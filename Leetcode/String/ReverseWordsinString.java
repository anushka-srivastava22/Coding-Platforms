class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder current = new StringBuilder();
        int N = s.length();
        
        for(int i = N - 1; i >= 0; i--) {
            current.setLength(0);
            while(i >= 0 && s.charAt(i) != ' ') {
                current.append(s.charAt(i));
                i--;
            }
            if(current.length() > 0) {
                result.append(result.length() == 0 ? "": " ");
                result.append(current.reverse().toString());
            }
        }
        
        return result.toString();
    }
}
