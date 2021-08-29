class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        
        int i=0;
        int j=0;
        int max=0;
        while(i<=j && j<s.length())
        {
            if(!set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j));
                max = Math.max(set.size(),max);
                j++;
            }
            else
            {
                set.remove(s.charAt(i));
                i++;
            }
        }
        return max;
    }
}




















