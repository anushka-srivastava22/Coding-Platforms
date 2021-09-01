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
        int [] n = new int[3];
        for(int i=0; i<t; i++){
            n[0] = sc.nextInt();
            n[1] = sc.nextInt();
            n[2] = sc.nextInt(); 
            int x = Math.abs((n[2]-n[1])/3);
            if(n[2]>n[1]){
                n[2] =n[1];
            }       
            int k = n[0] +n[2]+x;
            System.out.println(k);
        }
	}
}
