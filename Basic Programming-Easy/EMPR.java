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
		    double p=sc.nextDouble();
		    double x=sc.nextDouble();
		    double y=sc.nextDouble();
		    double z=sc.nextDouble();
		    if(z==1){
		        p=p+(p*(y/100));
		    }
		    else{
		        p=p-(p*(x/100));
		    }
		    System.out.format("%.10f",p);
		    System.out.println();
		}
	}
}
