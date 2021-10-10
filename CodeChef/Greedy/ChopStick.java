/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int D = input.nextInt();
        int[] l = new int[N];
        for (int i = 0; i < N; i++) {
            l[i] = input.nextInt();
        }
        Arrays.sort(l);
        int i = 0;
        int ans = 0;
        while (i < N - 1) {
            if (l[i + 1] - l[i] <= D) {
                ans += 1;
                i += 2;
            } else {
                i++;
            }
        }
        System.out.println(ans);
	}
}
