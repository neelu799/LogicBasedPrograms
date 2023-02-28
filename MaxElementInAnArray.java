import java.io.*;
import java.util.*;
class MaxElementInAnArray 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int i,n=obj.nextInt();
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	Arrays.sort(a);
        	System.out.println(a[n-1]);
    	}
}