/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner in = new Scanner(System.in);
        PrintWriter out = new PrintWriter(System.out);

        int t = in.nextInt();

        for (int i = 0; i < t; i++) {
            int spots = in.nextInt();
            int m = in.nextInt();
            double max = (double)(spots/2.0) * ( (spots+1) + 2);
            min = 0;
            fillSpotsMin(0, spots+1);

            if(m < min){
                out.println(-1);
            }else if (m > max){
                out.println((int)(m - max));
            }else{
                out.println(0);
            }
        }

        out.close();
    }

    static int min = 0;

    static void fillSpotsMin(int start, int end){
        int pos = (start + end) / 2;

        min = min + (pos - start) + (end - pos);

        if(pos+1 != end){
            fillSpotsMin(pos, end);
        }
        if(pos-1 != start){
            fillSpotsMin(start, pos);
        }
    }
}
