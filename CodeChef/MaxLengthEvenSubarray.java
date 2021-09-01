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
		Scanner sc=new Scanner(System.in);
		int T = sc.nextInt();
		for(int x=1;x<=T;x++)
		{
		    int N = sc.nextInt();
		    int sum = 0;
		    int odd = (N+1)/2;
		    int ans = 0;
		    if(odd % 2 == 0)
		    {
		        ans = N;
		    }
		    else
		    {
		        ans = N-1;
		    }
		    System.out.println(ans);
		}
	}
}
