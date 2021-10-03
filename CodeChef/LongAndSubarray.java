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
		    long N = sc.nextInt();
		    if(N==1)
		    {
		        System.out.println("1");
		        continue;
		    }
		    long res = 1;
		    while(res * 2 <= N)
		    {
		        res = res*2;
		    }
		    long result = N - res + 1;
		    if(N == result)
		    {
		        System.out.println(res/2);
		    }
		    else 
		    {
		        System.out.println(Math.max(result,res/2));
		    }
		}
	}
}
