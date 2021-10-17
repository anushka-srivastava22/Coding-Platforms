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
		for(int j=1;j<=T;j++)
		{
		    int R[] = new int[5];
		    for(int i=0;i<5;i++)
		    {
		        R[i] = sc.nextInt();
		    }
		    int countIndia = 0;
		    int countEngland = 0;
		    for(int i=0;i<5;i++)
		    {
		        int x = R[i];
		        if(x == 1)
		        {
		            countIndia++;
		        }
		        else if( x == 2)
		        {
		            countEngland++;
		        }
		    }
		    if(countIndia > countEngland)
		    {
		        System.out.println("INDIA");
		    }
		    else if(countEngland > countIndia)
		    {
		        System.out.println("ENGLAND");
		    }
		    else
		    {
		        System.out.println("DRAW");
		    }
		}
	}
}
