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
		Scanner sc=new Scanner (System.in);
		int t=sc.nextInt();
		while(t-->0){
		    long n=sc.nextLong();
		    long m=sc.nextLong();
		    long count=(n*(n+1)*m*(m+1))/4;
		    System.out.println(count-(n*m));
		}
	}
}
