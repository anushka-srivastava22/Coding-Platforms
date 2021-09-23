/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
static boolean isLapindrome(char s[]){
        // Your Code Here
      int n=s.length;
      boolean t=true;
      int[] count1 =new int[256];
      int[] count2 =new int[256];
      for(int i=0,j=n-1;i<j;i++,j--)
      {
        count1[s[i]]++;
        count2[s[j]]++;
      }
      for(int i=0;i<256;i++)
      {
        if(count1[i]!=count2[i])
             {
                 t=false;
                 break;
             }
      }
      return t;
    }    
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T = sc.nextInt();//Number of Test Cases
        
        while(T--!=0){
            String s = sc.next();
            if(isLapindrome(s.toCharArray()))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
	}

}
