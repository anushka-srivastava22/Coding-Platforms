import java.util.*;
public class Solution {
    public static List<Integer> countSmaller(List<Integer> height) {
        // Write your code here. 
       List<Integer> ans = new ArrayList<>();
        int n = height.size();
        for(int i=0;i<n;i++)
        {
            ans.add(0);
            for(int j=i+1;j<n;j++)
            {
                if(height.get(i) > height.get(j) )
                {
                     ans.set(i,ans.get(i)+1);
                }
            }
            
        }
        return ans;
    }
}
