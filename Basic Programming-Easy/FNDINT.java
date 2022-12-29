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
		    long x=sc.nextLong();
		    String str=Long.toString(x);
		    if(str.length()==1){
		        x++;
		        System.out.println(x);
		    }
		    else{
		        int count=1;
		        while(count!=0){
		            x++;
		            str=Long.toString(x);
		            count=0;
		            for(int i=0;i<str.length()-1;i++){
		                for(int j=i+1;j<str.length();j++){
		                    if(str.charAt(i)==str.charAt(j)){
		                        count++;
		                    }
		                }
		            }
		        }   
		        System.out.println(x);
		    }
		}
	}
}
