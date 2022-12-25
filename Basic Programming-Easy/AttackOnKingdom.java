/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    int n=sc.nextInt();
		    int [] temp=new int[n];
		    for(int i=0;i<temp.length;i++){
		        temp[i]=sc.nextInt();
		    }
		    Arrays.sort(temp);
		    System.out.println(temp[1]);
		    
		    
		}
	}
}
