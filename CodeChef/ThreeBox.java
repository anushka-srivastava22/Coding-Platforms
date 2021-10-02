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
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    int C = sc.nextInt();
		    int D = sc.nextInt();
		    int sum = A + B + C;
		    if(sum <= D)
		    {
		        System.out.println("1");
		    }
		    else if(A + B <= D)
		    {
		        System.out.println("2");
		    }
		    else 
		    {
		        System.out.println("3");
		    }
		}
	}
}
