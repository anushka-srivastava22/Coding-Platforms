/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for (int i=0;i<t;i++)
        {
            int n = sc.nextInt();
            int l[] = new int[n];
            int r[] = new int[n];

            for (int j=0;j<n;j++)
                l[j] = sc.nextInt();

            for (int j=0;j<n;j++)
                r[j] = sc.nextInt();

            int mul[] = new int[n];
            for (int j=0;j<n;j++)
                mul[j] = l[j]*r[j];

            int movie=0,maxmul=0,max=0;
            for (int j=0;j<n;j++)
            {
                if (maxmul<=mul[j])
                {
                    if (max<r[j])
                    {
                        maxmul=mul[j];
                        max=r[j];
                        movie=j+1;
                    }
                }
            }
            System.out.println(movie);
        }
	}
}
