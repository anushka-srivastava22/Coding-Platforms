
/*
	Time Complexity: O(N^2)
	Space Complexity: O(N)
	
	Where N is the total number of elements of the array.
*/

import java.util.ArrayList;

public class Solution {
	public static ArrayList<Integer> maximumsumSubarray(int n, int arr[]) {

		
		int maxSum = Integer.MIN_VALUE;

		int start = 0;
		int end = -1;

		
		for (int i = 0; i < n; i++) {

			
			int localSum = 0;
			for (int j = i; j < n; j++) {
				
				localSum  += arr[j];

				
				if (localSum > maxSum) {
					maxSum = localSum;
					start = i;
					end = j;
				} else if (localSum == maxSum) {
					if (end - start < j - i) {
						start = i;
						end = j;
					}
				}
			}
		}

		ArrayList<Integer> list = new ArrayList<>();
		for (int i = start; i <= end; i++) {
			list.add(arr[i]);
		}

		return list;
	}

}

