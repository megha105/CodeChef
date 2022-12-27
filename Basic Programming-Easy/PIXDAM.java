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
		    int h=sc.nextInt();
		    int w=sc.nextInt();
		    int x=sc.nextInt();
		    int y=sc.nextInt();
		    int k=sc.nextInt();
		    if(Math.sqrt(Math.pow(w-x,2)+Math.pow(h-y,2))<k){
		        System.out.println("1");
		    }
		    else{
		        System.out.println("0");
		    }
		}
	}
}
