/* 
	Time complexity: O(N*log(N))
	Space complexity: O(N)

	Where N is the number of nodes in the binary tree.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

class Pair {
	BinaryTreeNode root;
	int level;

	Pair() {
	}

	Pair(BinaryTreeNode root, int level) {
		this.root = root;
		this.level = level;
	}
}

public class Solution {

	public static ArrayList<Integer> bottomView(BinaryTreeNode root) {
		// Horizontal distance of the root is initialised to 0.
		int horizontalDistance = 0;
		ArrayList<Integer> ans = new ArrayList<>();
		// Map with key as horzontal distance and value as the tree node.
		HashMap<Integer, BinaryTreeNode> mp = new HashMap<>();

		Queue<Pair> q = new LinkedList<>();
		// Enqueue the root.
		Pair p1 = new Pair(root, 0);
		q.add(p1);
		while (!q.isEmpty()) {
			Pair p = q.poll();

			// Update the value for every horizontal distance.
			mp.put(p.level, p.root);
			// If left child is present, push it.
			if (p.root.left != null) {
				q.add(new Pair(p.root.left, p.level - 1));
			}
			// If right child is present, push it.
			if (p.root.right != null) {
				q.add(new Pair(p.root.right, p.level + 1));
			}
		}
		ArrayList<Integer> bottomView = new ArrayList<>();

		for (int key : mp.keySet()) {
			bottomView.add(key);
		}
		// Sorting Keys according to the level Example (-2,-1,0,1,2).
		Collections.sort(bottomView);
		 // Store all final set of nodes in the answer vector.
			for (int i : bottomView) {
			ans.add(mp.get(i).val);
		}

		return ans;
	}

}
