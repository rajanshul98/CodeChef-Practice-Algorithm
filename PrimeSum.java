/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class PrimeSum
{
    public static boolean isPrime(int n){
        boolean flag = true;
        for(int i = 2; i*i <= n;i++){
            if(n % i == 0){
                flag = false;
                break;
            }
        }
        return flag;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
	    Scanner  scan = new Scanner(System.in);
	    int t = scan.nextInt();
	    int m = Integer.MIN_VALUE;
	    int[] num = new int[t];
	    for(int i = 0; i < t; i++){
            num[i] = scan.nextInt();
            m = Math.max(num[i],m);
	    }
	    ArrayList<Integer> al = new ArrayList<Integer>();
	    for(int i = 2; i <= m; i++){
	        if(isPrime(i))
	            al.add(i);
	    }
	    //System.out.println(al);
	    int len = al.size();
        long sum = 0;  
        int j = 0;
	    for(int i = 0; i < t; i++){
	        j = 0;
	        sum = 0;
	        while(j < len && num[i] >= al.get(j)){
	            sum += al.get(j);
	            j += 1;
	        }
	        System.out.println(sum);
	    }
	}
}
