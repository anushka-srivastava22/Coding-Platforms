class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	Scanner in = new Scanner (System.in);
	    int A[] = {100, 50, 10, 5, 2, 1};
	    int T = in.nextInt();
	    while (T-->0)
	    {
	        int N = in.nextInt();
	        int count = 0;
	        int i=0;
	        while (N>0)
	        {
	            int d = A[i];
	            if (N-d>=0)
	            {
	                N-=d;
	                count++;
	            }
	            else
	            i++;
	        }
	        System.out.println(count);
	    }
	}
}
