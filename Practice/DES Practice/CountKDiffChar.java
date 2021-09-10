import java.util.*;
public class Solution {
	public static int countSubStrings(String str, int k) {
		 // Write your code here.
        int res = 0;
        int count[] = new int[26];
        for(int i=0;i<str.length();i++)
        {
            Arrays.fill(count,0);
            int distChar = 0;
            for(int j=i;j<str.length();j++)
            {
                if(count[str.charAt(j) - 'a'] == 0)
                {
                    distChar++;
                }
                count[str.charAt(j) - 'a']++;
            	if(distChar == k)
            	{
                	res++;
            	}
            }
            
        }
        return res;
	}
}

