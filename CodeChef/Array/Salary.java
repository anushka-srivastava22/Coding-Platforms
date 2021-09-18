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
		    int W[] = new int[N];
		    for(int i=0;i<N;i++)
		    {
		        W[i] = sc.nextInt();
		    }
		    int min = Integer.MAX_VALUE;
		    int sum = 0;
		    for(int i=0;i<N;i++)
		    {
		        if(W[i] < min)
		        {
		            min = W[i];
		        }
		        sum+=W[i];
		    }
		    System.out.println(sum - (min*N));
		    
		}
	}
}
