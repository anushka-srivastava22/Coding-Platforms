
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner (System.in);
		int T = sc.nextInt();
		for(int x=1;x<=T;x++)
		{
		    long A = sc.nextLong();
		    long B = sc.nextLong();
		    long gcd_a = gcd(A,B);
		    long lcm_a = lcm(A,B);
		    System.out.println(gcd_a+" "+lcm_a);
		}
		
	}
	public static long gcd(long a,long b)
	{
	    if(b==0)
	    {
	        return a;
	    }
	    return gcd(b,a%b);
	}
	public static long lcm(long a, long b)
	{
	    return (a / gcd(a, b)) * b;
	}
	
}
