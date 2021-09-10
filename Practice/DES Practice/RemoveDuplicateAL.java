import java.util.*;

public class Solution {

	public static ArrayList<Integer> removeDuplicates(ArrayList<Integer> arr) {

		// Write your code here.
		ArrayList<Integer> ans = new ArrayList<Integer>();
        
        int n = arr.size();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr.get(i).intValue() == arr.get(j).intValue() && i!=j)
                {
                    arr.set(j,-1);
                }
            }
        }
        
        for(int i=0;i<n;i++)
        {
            if(arr.get(i).intValue() != -1)
            {
                ans.add(arr.get(i).intValue());
            }
        }
        return ans;
	}
}
