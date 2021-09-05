class Solution {
    public int lengthOfLastWord(String s) {
        int result = 0;

        for(int i = s.length() - 1; i >= 0; i--){ // Count from backwards
            if(s.charAt(i) == 32 && result == 0) 
                continue; 
            if(s.charAt(i) == 32) 
                return result; 
            result++;
        }

        return result;
    }
}
