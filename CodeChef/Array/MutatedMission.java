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
		    int K = sc.nextInt();
		    int A[] = new int[N];
		    for(int i=0;i<N;i++)
		    {
		        A[i] = sc.nextInt();
		    }
		    int count = 0;
		    for(int i=0;i<N;i++)
		    {
		        int sum = A[i] + K;
		        if(sum % 7 == 0)
		        {
		            count++;
		        }
		        
		    }
		    System.out.println(count);
		}
	}
}
