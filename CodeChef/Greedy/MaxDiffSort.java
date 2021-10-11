/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static Scanner s = new Scanner(System.in);
	public static void main (String[] args) throws java.lang.Exception
	{
		int t = s.nextInt();
		for(int i = 0; i < t; i++)
		{
		    System.out.println(solve());
		}
	}
	public static int solve()
	{
	    int n = s.nextInt();
	    int k = s.nextInt();
	    k = Math.min(k, n-k);
	    int weights[] = new int[n];
	    for(int i = 0; i < n; i++)
	    {
	        weights[i] = s.nextInt();
	    }
	    Arrays.sort(weights);
	    int small = 0, big = 0;
	    for(int i = 0; i < n; i++)
	    {
	        if(i < k)
	        {
	            small += weights[i];
	        }
	        else
	        {
	            big += weights[i];
	        }
	    }
	    return big - small;
	}
}
