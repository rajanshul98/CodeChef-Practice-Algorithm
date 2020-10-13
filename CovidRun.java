Question Link :- https://www.codechef.com/OCT20B/problems/CVDRUN
/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CovidRun
{
	public static void main (String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		int t, n, step, start, city;
		t = Integer.parseInt(br.readLine());
		boolean infected = false;
		StringBuffer sb = new StringBuffer();
		HashSet<Integer> hs;
		while(t-- > 0) {
			infected = false;
			String[] s = br.readLine().split(" ");
			
			n = Integer.parseInt(s[0]);
			step = Integer.parseInt(s[1]);
			start = Integer.parseInt(s[2]);
			city  = Integer.parseInt(s[3]);
			hs = new HashSet<Integer>();
			hs.add(start);
			while(true) {
				
				if(start == city) {
					infected = true;
					break;
				}
				start = (start + step)%n;
				if(hs.contains(start))
					break;
				else
					hs.add(start);
				
			}
			if(infected)
				sb.append("YES"+"\n");
			else
				sb.append("NO"+"\n");
		}
		System.out.println(sb);
		sc.close();
	}
}
