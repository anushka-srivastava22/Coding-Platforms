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
		    int X = sc.nextInt();
		    int Y = sc.nextInt();
		    int result = 0;
		    if(X<=Y)
		    {
		        if((Y-X)%2 == 0)
		        {
		            result = (Y-X)/2;
		        }
		        else
		        {
		            result = ((Y-X+1)/2) + 1;
		        }
		    }
		    else
		    {
		        result = X-Y;
		    }
		    System.out.println(result);
		    
		  
		}
	}
}
