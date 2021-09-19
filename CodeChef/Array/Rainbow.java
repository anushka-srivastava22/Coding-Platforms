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
		    int arr[] = new int[N];
		    for(int i=0;i<N;i++)
		    {
		        arr[i] = sc.nextInt();
		        
		    }
		    int p1=0,p2=N-1;
		    boolean isRainbow = true;
		    while(p1<p2)
		    {
		        if(arr[p1]!=arr[p2])
		        {
		            isRainbow = false;
		            break;
		        }
		        if(arr[p1+1] != arr[p1]+1 && arr[p1]!=arr[p1+1])
		        {
		            isRainbow = false;
		            break;
		        }
		        p1++;
		        p2--;
		    }
		    if(arr[p1] != 7)
		    {
		        isRainbow = false;
		    }
		    if(isRainbow)
		    {
		        System.out.println("yes");
		    }
		    else{
		        System.out.println("no");
		    }
		}
	}
}
