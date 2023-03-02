import java.io.*;
import java.util.*;
class ArrayReverse
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n=obj.nextInt(),i;
        	int a[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	for(i=n-1;i>=0;i--)
            	System.out.print(a[i]+" ");
    	}
}