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
		while(t>0) {
		int N=sc.nextInt();
		int S=sc.nextInt();
		if(S<N) {
			System.out.println(S);
		}
		else {
			int diff=S-N;
			int ans=N-diff;
			System.out.println(ans);
		}
		t--;
		}
	}
}
