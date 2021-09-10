/*
    Time Complexity: O(N)
    Space complexity: O(26)

    Where N is the size of the given string.
*/

public class Solution {
	public static String convertSentence(String s, int n) {

		// Creating a frequency array.
		String freq[] = { "2", "22", "222", "3", "33", "333", "4", "44", "444", "5", "55", "555", "6", "66", "666", "7",
				"77", "777", "7777", "8", "88", "888", "9", "99", "999", "9999" };

		StringBuilder ans = new StringBuilder();
		for (int i = 0; i < n; i++) {
			// Finding the position of the character in the freq array.

			int pos = (s.charAt(i) - 'a');
			ans.append(freq[pos]);
		}

		return ans.toString();
	}
}
