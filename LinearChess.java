/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    public static int findPlayer(int[] pla_pos, int N, int K){
        int player = -1, steps = Integer.MAX_VALUE;
        for(int i = 0; i < N; i++){
            if(K % pla_pos[i] == 0){
                int current = K/pla_pos[i];
                if(steps > current){
                    steps = current;
                    player = pla_pos[i];
                }
            }
        }
        return player;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int t = Integer.parseInt(br.readLine());
	        int N = 0, K = 0, res = 0;
	        int[] pla_pos;
	        while(t-- > 0){
	            String[] s = br.readLine().split(" ");
	            N = Integer.parseInt(s[0]);
	            K = Integer.parseInt(s[1]);
	            s = br.readLine().split(" ");
	            pla_pos = new int[N];
	            for(int i = 0; i < N; i++){
	                pla_pos[i] = Integer.parseInt(s[i]);
	            }
	            res = findPlayer(pla_pos, N, K);
	            System.out.println(res);
	        }
	}
}
