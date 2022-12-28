/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    long x=sc.nextLong();
		    int count=0;
		    int [] w=new int[n];
		    for(int i=0;i<n;i++){
		        w[i]=sc.nextInt();
		        if(w[i]==1){
		            count++;
		        }
		        else{
		            if(i>0){
		                if(w[i-1]==1){
		                count++;
		                }
		            }
		            
		        }
	    	}
	    	System.out.println(count*x);
	    	
	    	
	    	
	    }
    }
}