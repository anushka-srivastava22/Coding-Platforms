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
	    Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		while(testcase!=0){
		    int x = sc.nextInt(), y=sc.nextInt(), k=sc.nextInt(), n = sc.nextInt();
		    while(n!=0){
		        int p = sc.nextInt();
		        int c = sc.nextInt();
		        if(c<=k && p>=x-y){
		            System.out.println("LuckyChef");
		            n--;
		            break;
		        }
		        if(n==1){
		            System.out.println("UnluckyChef");
		        }
		        n--;
		    }
		    while(n!=0){
		        int a = sc.nextInt();
		        int b = sc.nextInt();
		        n--;
		    }
		    testcase--;
		}
		
		
	}
}
