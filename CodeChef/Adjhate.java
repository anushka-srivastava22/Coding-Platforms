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
    	Scanner s =new Scanner(System.in);
		int t=s.nextInt();
		for(int i=0;i<t;i++){
		    int n=s.nextInt();
		    ArrayList<Integer> e=new ArrayList<Integer>();
		    ArrayList<Integer> o=new ArrayList<Integer>();
		    int[] a=new int[n];
		    for(int j=0;j<n;j++){
		        a[j]=s.nextInt();
		    }
		    for(int j=0;j<n;j++){
		        if(a[j]%2==0){
		            e.add(a[j]);
		        }
		        else{
		            o.add(a[j]);
		        }
		    }
		    if(e.size()==0 || o.size()==0){
		        System.out.println("-1");
		    }
		    else{
		        e.addAll(o);
                System.out.println(e.toString().replace("[","").replace("]","").replace(",",""));
		    }
		}
	}
}
