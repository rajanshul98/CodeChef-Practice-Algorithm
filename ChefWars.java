/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int whoWinner(int H, int P){
        // 1 - Chef Wins, 0 - Darth Wins
        if(P == 0)
            if(H <= 0)
                return 1;
            else
                return 0;
        return whoWinner(H-P, P/2);
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.parseInt(br.readLine());
	        int H = 0, P = 0;
	        while(t-- > 0){
	            String[] s = br.readLine().split(" ");
	            H = Integer.parseInt(s[0]);
	            P = Integer.parseInt(s[1]);
	            int res = whoWinner(H, P);
	            System.out.println(res);
	        }
	}
}
