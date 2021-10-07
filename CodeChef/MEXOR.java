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
		    if(N == 0)
		    {
		        System.out.println("1");
		    }
		    else if(N == 1 || N == 2)
		    {
		        System.out.println("2");
		    }
		    else
		    {
		        int sum = 1;
		        while( 2*sum  <= N)
		        {
		            sum *= 2;
		        }
		        if(sum == N)
		        {
		            System.out.println(N);
		        }
		        else if(N == (2*sum - 1))
		        {
		            System.out.println(N + 1);
		        }
		        else
		        {
		            System.out.println(sum);
		        }
		    }
		}
	}
}
