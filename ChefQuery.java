//Question Link :- https://www.codechef.com/OCT20B/problems/CHEFEZQ/

import java.util.*;
import java.lang.*;
import java.io.*;

class ChefQuery
{
	public static long countBusyDay(long[] que, int n, int k) {
		long count = 0;
		for(int i = 0; i < n-1; i++) {
			if(que[i] >= k) {
				que[i+1] = que[i+1] + que[i]-k;
				count++;
			}
			else
				return ++count;
		}
		count = count + que[n-1]/k + 1; 
		return count;
	}
	public static void main(String[] args) throws java.lang.Exception {
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int n, k;
		StringBuffer sb = new StringBuffer();
		while(t-- > 0) {
			String[] s = br.readLine().split(" ");
			n = Integer.parseInt(s[0]);
			k = Integer.parseInt(s[1]);
			long[] que = new long[n];
			s = br.readLine().split(" ");
			for(int i = 0; i < n; i++) {
				que[i] = Long.parseLong(s[i]);
			}
			long busyday = countBusyDay(que, n, k);
			sb.append(busyday + "\n");
		}
		
		System.out.print(sb);
		}
		catch(Exception e){
		    
		}
	}
}
