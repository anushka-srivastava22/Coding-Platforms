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
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		int T = sc.nextInt();
		for(int x=1;x<=T;x++)
		{
		    int N = sc.nextInt();
		    int A = sc.nextInt();
		    int B = sc.nextInt();
		    String s = sc.next();
		    
		    int sum=0;
		    for(int i=0;i<s.length();i++)
		    {
		        char ch = s.charAt(i);
		        if(ch == '0')
		        {
		            sum +=A;
		        }
		        else
		        {
		            sum += B;
		        }
		    }
		   
		    System.out.println(sum);
		}
	}
}
