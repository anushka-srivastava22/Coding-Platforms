/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Slove();
	}
	
	public static void Slove() {
		int t = sc.nextInt();
		while(t -- > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();
			String[] s = new String[n];
			boolean[] p = new boolean[n];
			
			for(int i=0; i<s.length; i++)
			{
				s[i] = sc.next();
			}
			
			while(k -- > 0) {
				int m = sc.nextInt();
				String[] a = new String[m];
				
				for(int i=0; i<a.length; i++) 
				{
					a[i] = sc.next();
				}
				
				for(int i=0; i<s.length; i++) {
					if(p[i] == false)
					{
						for(int j=0; j<a.length; j++) 
						{
							if(s[i].equals(a[j]))
							{
								p[i] = true;
								break;
							}
						}
					}
					else 
					{
						continue;
					}
				}
				
			}
			for(int i=0; i<p.length; i++) 
			{
				if(p[i] == true)
				{
					System.out.print("YES"+" ");
				}
				else 
				{
					System.out.print("NO"+" ");
				}
			}
		}
		
	}
}
