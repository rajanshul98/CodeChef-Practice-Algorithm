/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{		// your code goes here
	    try{
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int t = Integer.parseInt(br.readLine());
	    while(t-- > 0){
	        String[] s = br.readLine().split(" ");
	        int pc = Integer.parseInt(s[0]);
	        int pr = Integer.parseInt(s[1]);
	        int count_pc = pc % 9 == 0 ? pc/9 : (pc/9) + 1;
	        int count_pr = pr % 9 == 0 ? pr/9 : (pr/9) + 1;
	        if(count_pc >= count_pr){
	            System.out.println("1 " + count_pr);
	        }
	        else
	            System.out.println("0 " + count_pc);
	    }
	    }
	    catch(Exception e){
	        return;
	    }

	}
}
