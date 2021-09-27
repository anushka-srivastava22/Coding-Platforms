import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class C5{
	public static void main(String[] args){
		FastReader sc = new FastReader();
		String s=sc.next();
		int n=s.length();
		int start[]=new int [1000001];
		int extend[]=new int [1000001];
		int fre[]=new int [1000001];
		Stack<Integer> st= new Stack<Integer>();
		int mx=0;
		for(int i=0;i<n;i++) {
			char c=s.charAt(i);
			if(c=='(')st.push(i);
			else {
				if(st.isEmpty())start[i]=extend[i]=-1;
				else {
					int top=st.pop();
					start[i]=extend[i]=top;
					if(top>0 && s.charAt(top-1)==')' && start[top-1]>=0) {
						extend[i]=extend[top-1];
					}
					int l=i-extend[i]+1;
					fre[l]++;
					mx=Math.max(mx, l);
				}
			}
		}
		fre[0]=1;
		System.out.println(mx+" "+fre[mx]);
    }
 
	static class pair {
		int x;int y;
		 pair(int x,int y){
			this.x=x;
			this.y=y;
		}
		
	}
	static ArrayList<Integer> primeFac(int n){
		ArrayList<Integer>ans = new ArrayList<Integer>();
		int lp[]=new int [n+1];
		Arrays.fill(lp, 0);  	//0-prime
		for(int i=2;i<=n;i++) {
			if(lp[i]==0) {
				for(int j=i;j<=n;j+=i) {
					if(lp[j]==0) lp[j]=i;
				}
			}
		}
		int fac=n;
		while(fac>1) {
			ans.add(lp[fac]);
			fac=fac/lp[fac];
		}
		print(ans);
		return ans;
	}
	static ArrayList<Long> prime_in_given_range(long l,long r){
		ArrayList<Long> ans= new ArrayList<>();
		int n=(int)Math.sqrt(r)+1;
		int prime[]=sieve_of_Eratosthenes(n);
		long res[]=new long [(int)(r-l)+1];
		for(int i=0;i<=r-l;i++) {
			res[i]=i+l;
		}
		for(int i=0;i<prime.length;i++) {
			if(prime[i]==1) {
				System.out.println(2);
				for(int j=Math.max((int)i*i, (int)(l+i-1)/i*i);j<=r;j+=i) {
					res[j-(int)l]=0; 
				}
			}
		}
		for(long i:res) if(i!=0)ans.add(i);
		return ans;
	}
	static int [] sieve_of_Eratosthenes(int n) {
		int prime[]=new int [n];
		Arrays.fill(prime, 1);  // 1-prime | 0-not prime
		prime[0]=prime[1]=0;
		for(int i=2;i<n;i++) {
			if(prime[i]==1) {
				for(int j=i*i;j<n;j+=i) {
					prime[j]=0;
				}
			}
		}
		return prime;
	}
	static long binpow(long a,long b) {
		long res=1;
		if(b==0)return a;
		if(a==0)return 1;
		while(b>0) {
			if((b&1)==1) {
				res*=a;
			}
			a*=a;
			b>>=1;
		}
		return res;
	}
	static void print(int a[]) {
		System.out.println(a.length);
		for(int i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	static void print(long a[]) {
		System.out.println(a.length);
		for(long i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	static void print(ArrayList<Integer> a) {
		System.out.println(a.size());
		for(long i:a) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	static class FastReader {
		BufferedReader br;
		StringTokenizer st;
 
		public FastReader()
		{
			br = new BufferedReader(
				new InputStreamReader(System.in));
		}
		int [] fastArray(int n) {
			int a[]=new int [n];
			for(int i=0;i<n;i++) {
				a[i]=nextInt();
			}
			return a;
		}
		String next()
		{
			while (st == null || !st.hasMoreElements()) {
				try {
					st = new StringTokenizer(br.readLine());
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
 
		int nextInt() { return Integer.parseInt(next()); }
 
		long nextLong() { return Long.parseLong(next()); }
 
		double nextDouble()
		{
			return Double.parseDouble(next());
		}
 
		String nextLine()
		{
			String str = "";
			try {
				str = br.readLine();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			return str;
		}
	}
 
}
