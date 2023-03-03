import java.io.*;
import java.util.*;
class DifferenceBetweenTwoArrays 
{
    	public static void main(String[] args) 
	{
        	Scanner obj = new Scanner(System.in);
        	int n=obj.nextInt(),i;
        	int a[]=new int[n];
        	int b[]=new int[n];
        	int c[]=new int[n];
        	for(i=0;i<n;i++)
            	a[i]=obj.nextInt();
        	for(i=0;i<n;i++)
            	b[i]=obj.nextInt();
        	for(i=0;i<n;i++)
            	c[i]=a[i]-b[i];
        	for(i=0;i<n;i++)
            	System.out.print(c[i]+" ");
    	}
}