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
		int n=sc.nextInt();
		int [] h=new int[n];
		int count =0;
		int m=0;
		for(int i=0;i<n;i++){
		    h[i]=sc.nextInt();
		    if(m<h[i]){
		        m=h[i];
		        count++;
		    }
		}
		System.out.println(count);
		
	}
}
