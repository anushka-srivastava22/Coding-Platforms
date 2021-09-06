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
		int t = sc.nextInt();
		sc.nextLine();
		for(int test = 0; test < t; test++){
		    String s = sc.nextLine();
		    int l = s.length();
		    char[] arr1, arr2;
		    if(l % 2 == 0){
		        arr1 = s.substring(0, l/2).toCharArray();
		        arr2 = s.substring(l/2, l).toCharArray();;
		    }
		    else{
		        arr1 = s.substring(0, (l-1)/2).toCharArray();;
		        arr2 = s.substring((l-1)/2 + 1, l).toCharArray();;
		    }
		    Arrays.sort(arr1);
		    Arrays.sort(arr2);
		    
		    if(Arrays.equals(arr1, arr2)) System.out.println("YES");
		    else System.out.println("NO");
		}
		sc.close();
	}
}
