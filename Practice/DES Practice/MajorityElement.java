/*
    Time Complexity: O(N)
    Space Complexity: O(N)

    Where 'N' is the number of elements in the given array/list.
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution 
{
    public static ArrayList<Integer> majorityElementII(ArrayList<Integer> arr) 
    {

        int n = arr.size();

        // Array for storing final answer.
        ArrayList<Integer> majorityElement = new ArrayList<Integer>();

        // HashMap to store the frequency of every element.
        HashMap<Integer, Integer> freq = new HashMap<Integer, Integer>();

        // Iterate through the array/list.
        for (int i = 0; i < n; i++) 
        {
            // Increment the value in the HashMap.
            if (freq.containsKey(arr.get(i))) 
            {
                freq.put(arr.get(i), freq.get(arr.get(i))+1);
            } 
            else 
            {
                freq.put(arr.get(i), 1);
            }
        }

        // Iterate through the HashMap.
        for (Map.Entry<Integer, Integer> e : freq.entrySet()) 
        {
            // Store all the elements with frequency greater than n/3.
            if (e.getValue() > n / 3) 
            {
                majorityElement.add(e.getKey());
            }
        }

        // Return all the stored majority elements.
        return majorityElement;

    }
}
