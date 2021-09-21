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
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		while(n-->0)
		{
		    int a=in.nextInt();
		    int b=in.nextInt();
		    int c=in.nextInt();
		    int r=0;
		    int d[]=new int[a];
		    int g[]=new int[100];
		    for(int i=0;i<a;i++)
		    {
		        d[i]=in.nextInt();
		        
		        int e=d[i]+(b*c);
		        if(e>100)
		        e=100;
		        
		        int f=d[i]-(b*c);
		        if(f<1)
		        f=1;
		        
		        for(int j=f-1;j<e;j++)
		        g[j]=1;
		        
		    }
		    for(int k=0;k<100;k++)
		    {
		        if(g[k]==0)
		        r++;
		    }
		    System.out.println(r);
		}
	}
}
