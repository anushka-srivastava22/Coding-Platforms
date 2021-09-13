class Solution {
    public int firstUniqChar(String s) {
        int a[] = new int [256];
        int t=-1;
        for(int i=0;i<s.length();i++)
        {
            a[s.charAt(i)]++;
        }
        for(int i=0;i<s.length();i++)
        {
            if( a[s.charAt(i)] == 1)
            {
                t=i;
               return t;
            }
        }
        return t;
    }
}
