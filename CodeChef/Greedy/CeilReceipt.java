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
        int t=sc.nextInt();
        while(t-->0)
        {
            int p=sc.nextInt();
            int res=0;
            for(int i=11;i>=0;i--)
            {
                int curmenu=(int)Math.pow(2,i);
                while(p>=curmenu)
                {
                    p=p-curmenu;
                    res++;
                }
            }
            System.out.println(res);
	}
	}
}
